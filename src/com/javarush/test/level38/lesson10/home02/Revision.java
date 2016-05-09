package com.javarush.test.level38.lesson10.home02;

public @interface Revision {
    int revision();//напиши свой код
    Date date();
    Author[] authors() default {};
    String comment() default "";
}
