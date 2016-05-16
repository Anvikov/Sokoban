package ru.dormammu.edu.sokoban.model;

import java.awt.*;

/**
 * Created by User on 001 2016.05.01..
 */
public class Home extends GameObject {
    public Home(int x, int y) {
        super(x, y);
        setHeight(2);
        setWidth(2);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.drawRect(getX()-getWidth()/2,getY()-getHeight()/2,getWidth(),getHeight());
        graphics.fillRect(getX()-getWidth()/2,getY()-getHeight()/2,getWidth(),getHeight());
    }
}
