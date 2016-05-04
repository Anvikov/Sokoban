package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by User on 023 2016.02.23..
 */
public class Singleton {
    static Singleton INSTANCE = null;
    private Singleton() {}

    static Singleton getInstance() {
        if (INSTANCE==null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
