package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public void print (String a){
        System.out.println(a);
    }//Напишите тут ваши методы
    public void print (int a){
        String s=Integer.toString(a);
        System.out.println(s);
    }//Напишите тут ваши методы
    public void print (int a, String s){
        for (int i = 0; i <a ; i++)
        {
            System.out.println(s);
        }

    }//Напишите тут ваши методы
    public void print (Integer a, String s){
        for (int i = 0; i <a ; i++)
        {
            System.out.println(s);
        }

    }//Напишите тут ваши методы
    public void print (Integer a,Integer b, String s){
        for (int i = 0; i <a ; i++)
        {
            System.out.println(s);
        }

    }//Напишите тут ваши методы
}
