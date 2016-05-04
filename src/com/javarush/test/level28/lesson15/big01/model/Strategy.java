package com.javarush.test.level28.lesson15.big01.model;

import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.List;

/**
 * Created by User on 021 2016.03.21..
 */
public interface Strategy {
     List<Vacancy> getVacancies(String searchString);
}
