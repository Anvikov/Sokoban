package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by User on 019 2016.03.19..
 */
public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    @Override
    protected void initDishes() throws IOException {
        dishes = new ArrayList<>();
        Dish[] dishs = Dish.values();
        for (int i = 0; i < dishs.length; i++) {
            dishes.add(dishs[(int) (Math.random() * dishs.length)]);
        }
    }
}
