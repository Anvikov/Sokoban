package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1=new FileInputStream(bufferedReader.readLine());
        FileOutputStream file2=new FileOutputStream(bufferedReader.readLine());
        bufferedReader.close();

        byte[] bytes=new byte[file1.available()];

        file1.read(bytes,0,bytes.length);
        file1.close();

        for (int i = bytes.length-1; i >=0 ; i--) {
            file2.write(bytes[i]);
        }

        file2.close();
    }
}
