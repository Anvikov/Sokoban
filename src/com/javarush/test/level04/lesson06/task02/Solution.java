package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));

        String s=reader.readLine();//напишите тут ваш код
        String s2=reader.readLine();//напишите тут ваш код
        String s3=reader.readLine();//напишите тут ваш код
        String s4=reader.readLine();//напишите тут ваш код

        int i=Integer.parseInt(s);
        int i2=Integer.parseInt(s2);
        int i3=Integer.parseInt(s3);
        int i4=Integer.parseInt(s4);


        if (first(i,i2)>i3 && first(i,i2)>i4)
        System.out.println(first(i,i2));
        else if(i3>i4) System.out.println(i3); else System.out.println(i4);
    }

    public static int first(int a, int b) {
        if(a>b) return a; else return b;
    }
}
