package ru.dormammu.edu.sokoban.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 001 2016.05.01..
 */
public class GameObjects {
    private Set<Wall> walls;
    private Set<Box> boxes;
    private Set<Home> homes;
    private Player player;

    public GameObjects(Set<Wall> walls, Set<Box> boxes, Set<Home> homes, Player player) {
        this.walls = walls;
        this.boxes = boxes;
        this.homes = homes;
        this.player = player;
    }

    public Set<Wall> getWalls() {
        return walls;
    }

    public Set<Box> getBoxes() {
        return boxes;
    }

    public Set<Home> getHomes() {
        return homes;
    }

    public Player getPlayer() {
        return player;
    }
    public Set<GameObject> getAll(){
        Set<GameObject> res=new HashSet<>();
        res.addAll(getWalls());
        res.addAll(getBoxes());
        res.addAll(getHomes());
        res.add(getPlayer());
        return res;
    }
}
