package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1=new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2=new BufferedWriter(new FileWriter(args[1]));

        String line;
        while ((line=file1.readLine())!=null){
            String[] stroka=line.split(" ");
            for (int i = 0; i <stroka.length ; i++) {
                Pattern pattern = Pattern.compile("[0-9]");
                Matcher matcher = pattern.matcher(stroka[i]);
                if (matcher.find()){
                    file2.write(stroka[i]+" ");
                }
            }
            file2.write("\n");
        }
        file1.close();
        file2.flush();
        file2.close();
    }
}
