package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());

        byte[] b=new byte[file1.available()];
        int avab=file1.available();
        for (int i = 0; i <avab ; i++) {
            b[i]= (byte) file1.read();
        }

        for (int i = avab; i >=0 ; i--) {
            file2.write(b[i]);
        }
        file1.close();
        file2.close();
    }
}
