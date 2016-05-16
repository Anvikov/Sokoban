package ru.dormammu.edu.sokoban.view;

import ru.dormammu.edu.sokoban.controller.EventListener;
import ru.dormammu.edu.sokoban.model.Direction;
import ru.dormammu.edu.sokoban.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;

/**
 * Created by User on 030 2016.04.30..
 */
public class Field extends JPanel {
    private View view;
    private EventListener eventListener;

    public Field(View view) {
        this.view = view;
        addKeyListener(new KeyHandler());
        setFocusable(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);

        Set<GameObject> gameObjects = view.getGameObjects().getAll();

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(g);
        }

    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public EventListener getEventListener() {
        return eventListener;
    }

    public class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT: {
                    eventListener.move(Direction.LEFT);
                    break;
                }
                case KeyEvent.VK_RIGHT: {
                    eventListener.move(Direction.RIGHT);
                    break;
                }
                case KeyEvent.VK_UP: {
                    eventListener.move(Direction.UP);
                    break;
                }
                case KeyEvent.VK_DOWN: {
                    eventListener.move(Direction.DOWN);
                    break;
                }
                case KeyEvent.VK_R: {
                    eventListener.restart();
                    break;
                }
            }
        }
    }
}


