package ru.dormammu.edu.sokoban.view;

import ru.dormammu.edu.sokoban.controller.Controller;
import ru.dormammu.edu.sokoban.controller.EventListener;
import ru.dormammu.edu.sokoban.model.GameObjects;

import javax.swing.*;

public class View extends JFrame {
    private Controller controller;
    private Field field;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }

    public void setEventListener(EventListener eventListener) {
        field.setEventListener(eventListener);
    }

    public void update() {
        field.repaint();
    }

    public GameObjects getGameObjects() {
        return controller.getGameObjects();
    }

    public void completed(int level) {
        update();
        JOptionPane.showMessageDialog(null, "Уровень " + level + " пройден!", "Уровень пройден!", JOptionPane.INFORMATION_MESSAGE);
        controller.startNextLevel();
    }
}
