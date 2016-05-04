package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        HashMap<String,Integer> map=new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (boolean exit=false; !exit;)
        {
            try
            {
            Integer index=Integer.parseInt(reader.readLine());
            String stroka=reader.readLine();

                if (stroka.isEmpty()) exit = true;
                else map.put(stroka, index);
            }
            catch (NumberFormatException e){
                break;
            }
        }


        for (Map.Entry<String,Integer> pari:map.entrySet())
        {
            int id=pari.getValue();
            String name=pari.getKey();
            System.out.println(id + " " + name);;
        }
    }
}
