package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String fileName=reader.readLine();
        String fileName2=reader.readLine();

        BufferedReader fileReader=new BufferedReader(new FileReader(fileName));
        BufferedWriter fileWriter= new BufferedWriter(new FileWriter(fileName2));
        String[] number;
        String line;
        line=fileReader.readLine();
        number=(line.split(" "));
        for (int i = 0; i <number.length ; i++) {
            double d=Double.parseDouble(number[i]);
            long a=Math.round(d);
            fileWriter.write((int) d);
        }
        fileWriter.flush();
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
