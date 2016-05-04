package com.javarush.test.level30.lesson15.big01.client;

import com.javarush.test.level30.lesson15.big01.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by User on 003 2016.04.03..
 */
public class BotClient extends Client {
    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    protected boolean shouldSentTextFromConsole() {
        return false;
    }

    protected String getUserName() {
        int xx = (int) (Math.random() * 99);
        return "date_bot_" + xx;
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(": ")) {
                String nameOfSender_Text[] = message.split(": ");
                String nameOfSender = "";
                nameOfSender = nameOfSender_Text[0];
                String text = "";
                text = nameOfSender_Text[1];
                SimpleDateFormat format = null;

                if ("дата".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("d.MM.YYYY");
                } else if ("день".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("d");
                } else if ("месяц".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("MMMM");
                } else if ("год".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("YYYY");
                } else if ("время".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("H:mm:ss");
                } else if ("час".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("H");
                } else if ("минуты".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("m");
                } else if ("секунды".equalsIgnoreCase(text)) {
                    format = new SimpleDateFormat("s");
                }

                if (format != null) {
                    sendTextMessage("Информация для " + nameOfSender + ": " + format.format(Calendar.getInstance().getTime()));
                }
            }
        }
    }
}
