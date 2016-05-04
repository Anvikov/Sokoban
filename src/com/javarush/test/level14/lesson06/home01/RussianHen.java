package com.javarush.test.level14.lesson06.home01;

import static com.javarush.test.level14.lesson06.home01.Solution.*;

/**
 * Created by Dormammu on 2016-01-08.
 */
public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 10000;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}