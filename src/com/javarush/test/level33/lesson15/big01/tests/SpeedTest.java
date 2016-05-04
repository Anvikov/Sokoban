package com.javarush.test.level33.lesson15.big01.tests;

import com.javarush.test.level33.lesson15.big01.Helper;
import com.javarush.test.level33.lesson15.big01.Shortener;
import com.javarush.test.level33.lesson15.big01.strategies.HashBiMapStorageStrategy;
import com.javarush.test.level33.lesson15.big01.strategies.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 027 2016.04.27.
 */
public class SpeedTest {
    public long getTimeForGettingIds(Shortener shortener, Set<String> strings, Set<Long> ids) {
        ids = new HashSet<>();
        Date start = new Date();
        for (String s : strings) {
            ids.add(shortener.getId(s));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    public long getTimeForGettingStrings(Shortener shortener, Set<Long> ids, Set<String> strings) {
        strings = new HashSet<>();
        Date start = new Date();
        for (Long id : ids) {
            strings.add(shortener.getString(id));
        }
        Date end = new Date();
        return end.getTime() - start.getTime();
    }

    @Test
    public void testHashMapStorage() {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());

        HashSet<Long> ids = new HashSet<>();
        HashSet<String> origStrings = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            origStrings.add(Helper.generateRandomString());
        }

        Long timeHashMapIds = getTimeForGettingIds(shortener1, origStrings, ids);
        Long timeHashBiMapIds = getTimeForGettingIds(shortener2, origStrings, ids);

        Assert.assertTrue(timeHashMapIds > timeHashBiMapIds);

        Long timeHashMapString = getTimeForGettingStrings(shortener1, ids, origStrings);
        Long timeHashBiMapString = getTimeForGettingStrings(shortener2, ids, origStrings);

        Assert.assertEquals(timeHashMapString, timeHashBiMapString, 5);
    }
}
