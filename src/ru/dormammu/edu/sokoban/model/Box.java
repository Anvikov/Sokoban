package ru.dormammu.edu.sokoban.model;

import java.awt.*;

/**
 * Created by User on 001 2016.05.01..
 */
public class Box extends CollisionObject implements Movable {
    public Box(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.drawRect(getX()-getWidth()/2,getY()-getHeight()/2,getWidth(),getHeight());
        graphics.fillRect(getX()-getWidth()/2,getY()-getHeight()/2,getWidth(),getHeight());
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX()+x);
        this.setY(this.getY()+y);
    }
}
