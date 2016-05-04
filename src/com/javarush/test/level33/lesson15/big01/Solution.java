package com.javarush.test.level33.lesson15.big01;

import com.javarush.test.level33.lesson15.big01.strategies.HashMapStorageStrategy;
import com.javarush.test.level33.lesson15.big01.strategies.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 025 2016.04.25..
 */
public class Solution {
    public static Set<Long> getIds(Shortener shortener,Set<String> strings){
        Set<Long> result=new HashSet<>();
        for (String s:strings) {
            result.add(shortener.getId(s));
        }
        return result;
    }
    public static Set<String> getStrings(Shortener shortener,Set<Long> keys){
        Set<String> result=new HashSet<>();
        for (Long key:keys) {
            result.add(shortener.getString(key));
        }
        return result;
    }
    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        Helper.printMessage(strategy.getClass().getSimpleName());
        Set<String> res=new HashSet<>();
        for (int i = 0; i <elementsNumber ; i++) {
            res.add(Helper.generateRandomString());
        }
        Shortener shortener=new Shortener(strategy);
        Date start=new Date();
        Set<Long> Ids=getIds(shortener,res);
        Date end=new Date();
        Long timeIds=end.getTime()-start.getTime();
        Helper.printMessage(String.valueOf(timeIds));

        Date startString=new Date();
        Set<String> strings=getStrings(shortener,Ids);
        Date endString=new Date();
        Helper.printMessage(String.valueOf(endString.getTime()-startString.getTime()));

        if (strings.size()==Ids.size()){
            Helper.printMessage("Тест пройден.");
        }else {
            Helper.printMessage("Тест не пройден.");
        }
    }

    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(),10000);
    }
}
