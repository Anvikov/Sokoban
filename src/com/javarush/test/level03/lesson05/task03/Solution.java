package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static void main(String[] args)
    {
        //напишите тут ваш код
        int h = 5;
        int h2 = 3;
        int i = convertToSeconds(h);
        int u = convertToSeconds(h2);
        System.out.println(i);
        System.out.println(u);
    }

    public static int convertToSeconds(int hour)
    {
        int sec = hour * 3600;
        return sec;
    }
}