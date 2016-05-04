package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Dormammu on 2016-01-09.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "HRN";
    }
}
