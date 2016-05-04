package com.javarush.test.level33.lesson15.big01.strategies;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 024 2016.04.24..
 */
public class HashMapStorageStrategy  implements StorageStrategy{
    private HashMap<Long,String> data=new HashMap<>();

    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key,value);
    }

    @Override
    public Long getKey(String value) {
        if(value!=null&&containsValue(value)){
            for (Map.Entry<Long, String> pari:data.entrySet()) {
                if (pari.getValue().equals(value)){
                    return pari.getKey();
                }
            }
        }
        return null;
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}
