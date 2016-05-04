package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> set1=new HashSet<String>();
        set1.add("арбуз");
        set1.add("банан");
        set1.add("вишня");
        set1.add("груша");
        set1.add("дыня");
        set1.add("ежевика");
        set1.add("жень-шень");
        set1.add("земляника");
        set1.add("ирис");
        set1.add("картофель");

        for (String text: set1)
        {
            System.out.println(text);
        }//напишите тут ваш код

    }
}
