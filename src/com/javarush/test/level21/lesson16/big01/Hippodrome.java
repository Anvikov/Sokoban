package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by User on 015 2016.02.15..
 */
public class Hippodrome {
    public Hippodrome() {
    }

    public static void main(String[] args) {
        Hippodrome game=new Hippodrome();
        Horse horse1=new Horse("First",3,0);
        Horse horse2=new Horse("Second",3,0);
        Horse horse3=new Horse("Third",3,0);
    }
    ArrayList<Horse> horses=new ArrayList<>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }
}
