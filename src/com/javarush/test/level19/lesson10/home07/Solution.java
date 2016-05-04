package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1=new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2=new BufferedWriter(new FileWriter(reader.readLine()));

        String line;
        while((line=file1.readLine())!=null){
            String[]stroka=line.split(" ");
            System.out.println(line);
            for (int i = 0; i <stroka.length ; i++) {
                System.out.println(stroka[i]);
                if (stroka[i].length()>6)file2.write(stroka[i]+",");
                file2.flush();
            }
        }
        file1.close();
        file2.flush();
        file2.close();
    }
}
