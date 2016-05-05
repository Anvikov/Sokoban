package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1 = new FileInputStream(bufferedReader.readLine());
        FileOutputStream file2 = new FileOutputStream(bufferedReader.readLine());
        FileOutputStream file3 = new FileOutputStream(bufferedReader.readLine());
        bufferedReader.close();

        int available = file1.available();
        int file2length = (available % 2 == 0) ? available / 2 : (available / 2) + 1;
        int file3length = available - file2length;

        byte[] first = new byte[file2length];
        byte[] second = new byte[file3length];

        file1.read(first, 0, file2length);
        file1.read(second, 0, file3length);

        file2.write(first);
        file3.write(second);

        file1.close();
        file2.close();
        file3.close();
    }
}
