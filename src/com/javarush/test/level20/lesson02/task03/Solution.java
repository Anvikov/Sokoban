package com.javarush.test.level20.lesson02.task03;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполните карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуйте логику записи в файл и чтения из файла для карты properties.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//implement this method - реализуйте этот метод
        FileInputStream inputStream=new FileInputStream(reader.readLine());
        Properties fileProp=new Properties();
        fileProp.load(inputStream);
        for (final String name:fileProp.stringPropertyNames()) {
            properties.put(name, fileProp.getProperty(name));
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties saveProp = new Properties();
        for (Map.Entry<String, String> pari : properties.entrySet()) {
            saveProp.setProperty(pari.getKey(), pari.getValue());
        }
        saveProp.store(outputStream, null);

    }

    public void load(InputStream inputStream) throws Exception {
        Properties loadProp = new Properties();
        loadProp.load(inputStream);
        Map<String, String> mapLoad = new HashMap<>();
        for (final String name : loadProp.stringPropertyNames()) {
            mapLoad.put(name, loadProp.getProperty(name));
        }
        properties=mapLoad;
    }
}
