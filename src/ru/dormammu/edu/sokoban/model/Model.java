package ru.dormammu.edu.sokoban.model;

import ru.dormammu.edu.sokoban.controller.EventListener;

import java.nio.file.Paths;
import java.util.Set;

/**
 * Created by User on 030 2016.04.30..
 */
public class Model {
    static final int FIELD_SELL_SIZE = 20;
    private EventListener eventListener;
    private GameObjects gameObjects;
    private int currentLevel = 1;
    private LevelLoader levelLoader = new LevelLoader(Paths.get("D:\\levels.txt"));

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public GameObjects getGameObjects() {
        return gameObjects;
    }

    public void restartLevel(int level) {
        this.gameObjects = levelLoader.getLevel(level);
    }

    public void restart() {
        restartLevel(currentLevel);
    }

    public void startNextLevel() {
        currentLevel++;
        restartLevel(currentLevel);
    }

    public void move(Direction direction) {
        Player player= getGameObjects().getPlayer();
        if (checkWallCollision(player,direction)){
            return;
        }
        if (checkBoxCollision(direction)){
            return;
        }
        switch (direction){
            case LEFT:
                player.move(-FIELD_SELL_SIZE,0);
                break;
            case RIGHT:
                player.move(FIELD_SELL_SIZE,0);
                break;
            case UP:
                player.move(0,-FIELD_SELL_SIZE);
                break;
            case DOWN:
                player.move(0,FIELD_SELL_SIZE);
                break;
        }
        checkCompletion();
    }

    public boolean checkWallCollision(CollisionObject gameObject, Direction direction) {
        boolean res = false;
        Set<Wall> walls = getGameObjects().getWalls();

        for (Wall wall : walls) {
            if (gameObject.isCollision(wall, direction)) {
                res = true;
                break;
            }
        }
        return res;
    }

    public boolean checkBoxCollision(Direction direction) {
        Player player = getGameObjects().getPlayer();
        // находим во что упиратся
        GameObject stopper = null;
        for (GameObject gameObject : gameObjects.getAll()) {
            if (!(gameObject instanceof Player) && !(gameObject instanceof Home) && player.isCollision(gameObject, direction)) {
                stopper = gameObject;
            }
        }
        //дом или свободное место
        if (stopper == null) {
            return false;
        }

        if (stopper instanceof Box) {
            Box stopperBox = (Box) stopper;
            if (checkWallCollision(stopperBox, direction)) {
                return true;
            }
            for (Box box : gameObjects.getBoxes()) {
                if (stopperBox.isCollision(box, direction)) {
                    return true;
                }
            }
            switch (direction) {
                case LEFT:
                    stopperBox.move(-FIELD_SELL_SIZE, 0);
                    break;
                case RIGHT:
                    stopperBox.move(FIELD_SELL_SIZE, 0);
                    break;
                case UP:
                    stopperBox.move(0, -FIELD_SELL_SIZE);
                    break;
                case DOWN:
                    stopperBox.move(0, FIELD_SELL_SIZE);
            }
        }

        return false;
    }

    public void checkCompletion() {
        boolean y = true;

        for (Home home : getGameObjects().getHomes()) {
            boolean current = false;

            for (Box box : getGameObjects().getBoxes()) {
                if ((box.getX() == home.getX()) && (box.getY() == home.getY())) {
                    current = true;
                }
            }
            if (!current) y = false;
        }
        if (y) {
            eventListener.levelCompleted(currentLevel);
        }
    }
}

