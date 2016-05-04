package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int [] vvod = new int [5];

        for (int i = 0; i <5 ; i++)
        {
            vvod [i]=Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i <vvod.length-1 ; i++)
        {
            for (int j = 0; j < vvod.length-i-1 ; j++)
            {
                if (vvod[j]>vvod[j+1]){
                    int b=vvod[j];
                    vvod[j]=vvod[j+1];
                    vvod[j+1]=b;
                }
            }
        }
        for (int i = 0; i <vvod.length ; i++)
        {
            System.out.println(vvod[i]);
        }
    }

}
