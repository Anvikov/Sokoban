package com.javarush.test.level36.lesson04.home01;

import java.util.List;

/**
 * Created by User on 003 2016.05.03..
 */
public class Model {
    Service service=new Service();
    public List<String> getStringDataList() {
        return service.getData();
    }
}
