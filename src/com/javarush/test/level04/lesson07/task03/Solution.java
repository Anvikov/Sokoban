package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader= new BufferedReader (new InputStreamReader(System.in));//напишите тут ваш код

        String s= reader.readLine();
        String s2= reader.readLine();
        String s3= reader.readLine();

        int i1= Integer.parseInt(s);
        int i2= Integer.parseInt(s2);
        int i3= Integer.parseInt(s3);

        int count=0;
        if (i1>0) count=count+1;
        if (i2>0) count=count+1;
        if (i3>0) count=count+1;

        System.out.println(count);


        }
}
