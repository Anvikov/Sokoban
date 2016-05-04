package com.javarush.test.level02.lesson01.task01;

/* Реализация метода
Реализуй метод print. Метод должен вывести на экран переданную строку 4 раза. Каждый раз с новой строки.
*/
public class Solution
{
    public static void main(String[] args)
    {
        print("Java easy to learn!");
    }

    public static void print(String s)
    {
        for (int n=0;n<4;n++){
            System.out.println(s);//напишите тут ваш код
        }
    }
}
