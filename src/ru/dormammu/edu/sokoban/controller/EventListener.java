package ru.dormammu.edu.sokoban.controller;

import ru.dormammu.edu.sokoban.model.Direction;

/**
 * Created by User on 001 2016.05.01..
 */
public interface EventListener {
    void move(Direction direction);
    void restart();
    void startNextLevel();
    void levelCompleted(int level);
}
