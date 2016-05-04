package com.javarush.test.level18.lesson03.task05;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        Set<Integer> set = new TreeSet<Integer>();
        while (file.available() > 0) {
            set.add(file.read());
        }
        for (Integer next : set) {
            System.out.print(next + " ");
        }
        reader.close();
        file.close();
    }
}