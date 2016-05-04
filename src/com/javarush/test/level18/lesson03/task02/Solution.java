package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (; fileInputStream.read() > 0; ) {
            list.add(fileInputStream.read());
        }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<min){
                min=list.get(i);
            }
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
