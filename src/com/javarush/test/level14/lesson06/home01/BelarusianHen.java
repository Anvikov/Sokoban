package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Dormammu on 2016-01-08.
 */
public class BelarusianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 50000;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
