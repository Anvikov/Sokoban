package ru.dormammu.edu.sokoban.model;

/**
 * Created by User on 030 2016.04.30..
 */
public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        boolean res = false;

        switch (direction) {
            case DOWN:
                if (getX() == gameObject.getX() && (getY() + Model.FIELD_SELL_SIZE) == gameObject.getY()) {
                    res = true;
                }
                break;
            case LEFT:
                if ((getX() - Model.FIELD_SELL_SIZE) == gameObject.getX() && getY() == gameObject.getY()) {
                    res = true;
                }
                break;
            case UP:
                if (getX() == gameObject.getX() && (getY() - Model.FIELD_SELL_SIZE) == gameObject.getY()) {
                    res = true;
                }
                break;
            case RIGHT:
                if ((getX() + Model.FIELD_SELL_SIZE) == gameObject.getX() && getY() == gameObject.getY()) {
                    res = true;
                }
                break;
        }
        return res;
    }
}
