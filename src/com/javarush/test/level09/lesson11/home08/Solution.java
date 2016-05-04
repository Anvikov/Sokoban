package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] list1=new int[5]; //напишите тут ваш код
        int[] list2=new int[2]; //напишите тут ваш код
        int[] list3=new int[4]; //напишите тут ваш код
        int[] list4=new int[7]; //напишите тут ваш код
        int[] list5=new int[0];
        for (int i = 0; i <list1.length ; i++) {
            list1[i]=i+1;
        }
        for (int i = 0; i <list2.length ; i++) {
            list2[i]=i+2;
        }
        for (int i = 0; i <list3.length ; i++) {
            list3[i]=i+3;
        }
        for (int i = 0; i <list4.length ; i++) {
            list4[i]=i+4;
        }
        for (int i = 0; i <list5.length ; i++) {
            list5[i]=i+5;
        }
        ArrayList<int[]> createdList=new ArrayList<>();
        createdList.add(list1);
        createdList.add(list2);
        createdList.add(list3);
        createdList.add(list4);
        createdList.add(list5);
        return createdList;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
