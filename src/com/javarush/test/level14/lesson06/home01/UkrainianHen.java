package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Dormammu on 2016-01-08.
 */
public class UkrainianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 5000;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
