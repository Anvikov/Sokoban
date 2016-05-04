package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));//напишите тут ваш код


        int sum=0;
        for (boolean exit=false; !exit;) {
            String s=reader.readLine();
            int i=Integer.parseInt(s);
            sum=sum+i;
            exit=s.equals("-1");
        }
        System.out.println(sum);
    }
}
