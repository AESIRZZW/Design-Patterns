package com.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Observer
 * @Author: Aesir
 * @Date: 2019/5/10 20:21
 */

/*
 * Observer & Observable are deprecated since JDK 9.
 * PropertyChangeEvent & PropertyChangeListener are recommended.
 */
public class ConcreteObserver implements Observer {
    private String name;
    private String message;
    private int state;

    public ConcreteObserver(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        message = ((ConcreteSubject) o).getMessage();
        state = ((ConcreteSubject) o).getState();
        System.out.println("[" + name + "]:" + message);
        if (state == -1) {
            System.out.println("[" + name + "]:" + name + " will exit because subject is closed.");
        }
    }
}
