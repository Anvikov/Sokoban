package com.javarush.test.level32.lesson02.task01;

import java.io.IOException;
import java.io.RandomAccessFile;

/* Запись в файл
В метод main приходят три параметра:
1) fileName - путь к файлу
2) number - число, позиция в файле
3) text - текст
Записать text в файл fileName начиная с позиции number.
Если файл слишком короткий, то записать в конец файла.
*/
public class Solution {
    public static void main(String... args) throws IOException {
        RandomAccessFile randomAccessFile=new RandomAccessFile(args[0],"rw");
        long count=Long.parseLong(args[1]);
        String text=args[2];
        if (count > randomAccessFile.length()){
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(text.getBytes());
            randomAccessFile.close();
        }else{
            randomAccessFile.seek(count);
            randomAccessFile.write(text.getBytes());
            randomAccessFile.close();
        }
    }
}
