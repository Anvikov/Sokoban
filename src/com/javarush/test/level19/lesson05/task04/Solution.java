package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1=new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2=new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        String line;
        while ((line=file1.readLine())!=null){
            char[] stroka=line.toCharArray();
            for (int i = 0; i <stroka.length ; i++) {
                if (stroka[i]=='.'){
                    stroka[i]='!';
                }
            }
            file2.write(stroka);
            file2.append("\n");
        }
        file2.flush();
        file1.close();
        file2.close();
    }
}
