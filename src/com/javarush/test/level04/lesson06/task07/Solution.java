package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        String s=reader.readLine();//напишите тут ваш код
        String s2=reader.readLine();//напишите тут ваш код
        String s3=reader.readLine();//напишите тут ваш код

        int a=Integer.parseInt(s);
        int b=Integer.parseInt(s2);
        int c=Integer.parseInt(s3);

        if (a!=b) if (a!=c) System.out.println(1);
        if (b!=c) if(b!=a) System.out.println(2);
        if (c!=a) if (c!=b) System.out.println(3);
    }
}
