package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));

        String s=reader.readLine();//напишите тут ваш код
        String s2=reader.readLine();//напишите тут ваш код

        int m=Integer.parseInt(s);
        int n=Integer.parseInt(s2);

        for (int j = 0; j <m ; j++) {
            for (int k = 0; k <n ; k++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
