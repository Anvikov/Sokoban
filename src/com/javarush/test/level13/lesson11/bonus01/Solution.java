package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();// напишите тут ваш код

        BufferedReader file = new BufferedReader(new FileReader(fileName));
        String line;

        ArrayList<Integer> numbers = new ArrayList<>();
        while ((line = file.readLine()) != null) {
            numbers.add(Integer.parseInt(line));
        }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - i - 1; j++)
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int a2 = numbers.get(j + 1);
                    numbers.add(j, a2);
                    numbers.remove(j + 2);
                }

        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) System.out.println(numbers.get(i));
        }
    }
}
