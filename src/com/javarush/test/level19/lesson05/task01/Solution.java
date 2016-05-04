package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file1 = new FileReader(reader.readLine());
        FileWriter file2 = new FileWriter(reader.readLine());
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        for (; file1.ready(); ) {
            list.add(file1.read());
        }
        for (int i = 1; i < list.size(); i += 2) {
            file2.write(list.get(i));
        }
        file1.close();
        file2.close();
    }
}