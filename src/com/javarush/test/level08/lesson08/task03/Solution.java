package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Lucas", "Jordge");//напишите тут ваш код
        map.put("Morris", "Jordge");//напишите тут ваш код
        map.put("A", "Andre");//напишите тут ваш код
        map.put("B", "Padro");//напишите тут ваш код
        map.put("Escabar", "Padro");//напишите тут ваш код
        map.put("C", "Pedro");//напишите тут ваш код
        map.put("Potter", "Harry");//напишите тут ваш код
        map.put("Greinger", "Hermione");//напишите тут ваш код
        map.put("Wysley", "Ron");//напишите тут ваш код
        map.put("Strark", "Tony");//напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count=0;
        for (Map.Entry<String, String> pari:map.entrySet())
        {
            String value=pari.getValue();
            if (value.equals(name))count++;
        }//напишите тут ваш код
return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count=0;
        for (Map.Entry<String, String> pari:map.entrySet())
        {
            String key=pari.getKey();
            if (key.equals(lastName))count++;
        }//напишите тут ваш код
        return count;//напишите тут ваш код

    }
}
