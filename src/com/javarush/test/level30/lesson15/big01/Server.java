package com.javarush.test.level30.lesson15.big01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by User on 031 2016.03.31..
 */
public class Server {
    public static void main(String[] args) {
        ConsoleHelper.writeMessage("Ведите порт сервера");
        int serverPort = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            ConsoleHelper.writeMessage("Сервер запущен.");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Произошла ошибка " + e.getMessage());
        }
    }

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> pari : connectionMap.entrySet()) {
            try {
                pari.getValue().send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Сообщение не было отправленно");
            }
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message message = connection.receive();
                if (message.getType() == MessageType.USER_NAME) {
                    if (message.getData() != null && !message.getData().isEmpty()) {
                        if (connectionMap.get(message.getData()) == null) {
                            connectionMap.put(message.getData(), connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return message.getData();
                        }
                    }
                }

            }
        }

        private void sendListOfUsers(Connection connection, String name) throws IOException {
            for (Map.Entry<String, Connection> pari : connectionMap.entrySet()) {
                String nameClient = pari.getKey();
                Message message = new Message(MessageType.USER_ADDED, nameClient);
                if (!nameClient.equals(name)) {
                    connection.send(message);
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();

                if (message.getType() == MessageType.TEXT) {
                    String mes = userName + ": " + message.getData();
                    Message message1 = new Message(MessageType.TEXT, mes);
                    sendBroadcastMessage(message1);
                } else {
                    ConsoleHelper.writeMessage("Ошибка при передаче сообщения");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Установленно соединение с адресом "+socket.getRemoteSocketAddress());
            String clientName = null;
            try(Connection connection=new Connection(socket)) {
                clientName=serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED,clientName));
                sendListOfUsers(connection,clientName);
                serverMainLoop(connection,clientName);
            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным адресом");
            }

            connectionMap.remove(clientName);
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED,clientName));
            ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто");
        }
    }
}
