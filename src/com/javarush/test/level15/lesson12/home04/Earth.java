package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Dormammu on 2016-01-13.
 */
public class Earth implements Planet{
    private static Earth ourInstance = new Earth();

    public static Earth getInstance() {
        return ourInstance;
    }

    Earth() {
    }
}
