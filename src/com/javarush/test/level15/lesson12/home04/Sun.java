package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Dormammu on 2016-01-13.
 */
public class Sun implements Planet {
    private static Sun ourInstance = new Sun();

    public static Sun getInstance() {
        return ourInstance;
    }

    Sun() {
    }
}
