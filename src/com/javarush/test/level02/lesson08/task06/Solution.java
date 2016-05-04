package com.javarush.test.level02.lesson08.task06;

/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void print3(String s)
    {
        for (int n=0;n<2;n++){
            System.out.print(s+" ");//напишите тут ваш код
        }
        System.out.println(s);

    }
    public static void main(String[] args)
    {
        print3("window");
        print3("file");
    }
}