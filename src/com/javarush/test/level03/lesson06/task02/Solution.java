package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{

    public static void main(String[] args)
    {
        int m1=1;
        int m=1;
        for (int n = 0; n < 10; n++)
        {
            for (int n1 = 1; n1 < 11; n1++)
            {
                System.out.print(m1*m + " ");
                m1=m1+1;
                //напишите тут ваш код
            }
            m=m+1;
            m1=1;
            System.out.println();

        }

    }
}