package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Dormammu on 2016-01-13.
 */
public class Moon implements Planet {
    private static Moon ourInstance = new Moon();

    public static Moon getInstance() {
        return ourInstance;
    }

    Moon() {
    }
}
