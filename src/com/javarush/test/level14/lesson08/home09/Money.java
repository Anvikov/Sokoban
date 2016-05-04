package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    public Money(double amount)
    {
        this.amout=amount;
    }
private double amout;
    public double getAmount(){return amout;};

    public abstract String getCurrencyName();
}

