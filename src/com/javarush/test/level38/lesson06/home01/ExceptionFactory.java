package com.javarush.test.level38.lesson06.home01;

/**
 * Created by User on 007 2016.05.07..
 */
public class ExceptionFactory {
    public static Throwable getException(Enum message) {
        if (message != null) {
            String s = message.name().substring(0, 1).toUpperCase() + message.name().substring(1).toLowerCase().replaceAll("_", " ");

            if (message instanceof ExceptionApplicationMessage) {
                return new Exception(s);
            }
            if (message instanceof ExceptionDBMessage) {
                return new RuntimeException(s);
            }
            if (message instanceof ExceptionUserMessage) {
                return new Error(s);
            }
        }
        return new IllegalArgumentException();
    }
}
