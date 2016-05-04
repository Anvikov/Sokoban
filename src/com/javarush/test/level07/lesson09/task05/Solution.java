package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.DoubleBuffer;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list=new ArrayList<String>();//Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10 ; i++)
        {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i <result.size() ; i++)
        {
            System.out.println(result.get(i));
        }//Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i <list.size();i+=2)
        {
            list.add(i+1,list.get(i));
        }//напишите тут ваш код
        return list;
    }
}
