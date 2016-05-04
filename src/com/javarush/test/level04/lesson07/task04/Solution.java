package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader((System.in)));

        String s=reader.readLine();//напишите тут ваш код
        String s2=reader.readLine();//напишите тут ваш код
        String s3=reader.readLine();//напишите тут ваш код

        int i=Integer.parseInt(s);
        int i2=Integer.parseInt(s2);
        int i3=Integer.parseInt(s3);

        int countpol=0;
        int countnepol=0;

        if (i>0) countpol=countpol+1; else if (i<0) countnepol=countnepol+1;
        if (i2>0) countpol=countpol+1; else if (i2<0) countnepol=countnepol+1;
        if (i3>0) countpol=countpol+1; else if (i3<0) countnepol=countnepol+1;

        System.out.println("количество отрицательных чисел: "+countnepol);
        System.out.println("количество положительных чисел: "+countpol);

    }
}
