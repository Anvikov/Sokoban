package com.javarush.test.level19.lesson05.task05;

/* Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Удалить все знаки пунктуации, включая символы новой строки. Результат вывести во второй файл.
1
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
            String line2=line.replaceAll("\\p{Punct}","");
            file2.write(line2);
            file2.append("\n");
        }
        file2.flush();
        file1.close();
        file2.close();
    }
}
