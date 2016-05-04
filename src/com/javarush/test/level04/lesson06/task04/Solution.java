package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        String s=reader.readLine();//напишите тут ваш код
        String s2=reader.readLine();//напишите тут ваш код


        if (s.equals(s2)) System.out.println("Имена идентичны"); else
        {if (s.length()==s2.length()) System.out.println("Длины имен равны");}

    }
}
