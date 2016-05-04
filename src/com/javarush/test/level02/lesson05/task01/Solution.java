package com.javarush.test.level02.lesson05.task01;

/* 19
Закоментарь максимальное количество строк, чтобы на экран вывелось число 19
*/
public class Solution
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;

        y = y + x;//y=1

        x = x * 2;//x=2
        y = y + x;//y=3

        x = x * 2;//x=4
        y = y + x;//y=7

        //x = x * 2;//x=8
        y = y + x;//y=7+8=15

        x = x * 2;
        y = y + x;

        System.out.println(y);
    }
}
