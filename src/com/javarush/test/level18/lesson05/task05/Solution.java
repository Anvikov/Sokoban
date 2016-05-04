package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream=new FileInputStream(reader.readLine());
        reader.close();
        try{
            if(fileInputStream.read(new byte[fileInputStream.read()]) < 1000){
                throw new DownloadException();
            }
    }catch (Exception e){fileInputStream.close();throw new DownloadException();
        }
    }

    public static class DownloadException extends Exception{

    }
}
