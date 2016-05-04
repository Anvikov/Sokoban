package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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
        String s3=reader.readLine();
        int i=Integer.parseInt(s);//напишите тут ваш код
        int i2=Integer.parseInt(s2);//напишите тут ваш код
        int i3=Integer.parseInt(s3);

        int r;

        if (i==i2 & i2==i3) System.out.println(i+" "+i+" "+i); else//напишите тут ваш код
        if (i==i2 | i2==i3) System.out.println(i2+" "+i2);else
        if (i==i3)  System.out.println(i3+" "+i3);


    }
}