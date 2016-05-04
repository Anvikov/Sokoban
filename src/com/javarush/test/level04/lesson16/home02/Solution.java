package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();//напишите тут ваш код
        String s2 = reader.readLine();//напишите тут ваш код
        String s3 = reader.readLine();//напишите тут ваш код

        int i = Integer.parseInt(s);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        int max = 0, min=0;
        if (i > i2 && i > i3) max = i;
            if (i < i2 && i < i3) min = i;
            if (i2 > i && i2 > i3) max = i2;
            if (i2 < i && i2 < i3) min = i2;
            if (i3 > i && i3 > i2) max = i3;
            if (i3 < i && i3 < i2) min = i3;

            if (max != i && min != i) System.out.println(i);
            if (max != i2 && min != i2) System.out.println(i2);
            if (max != i3 && min != i3) System.out.println(i3);
    }
}
