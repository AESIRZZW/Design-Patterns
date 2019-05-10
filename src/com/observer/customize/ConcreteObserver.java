package com.observer.customize;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Observer
 * @Author: Aesir
 * @Date: 2019/5/10 18:17
 */
public class ConcreteObserver implements Observer {
    private String name;
    private String message;
    private int state;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        message = ((ConcreteSubject) subject).getMessage();
        state = ((ConcreteSubject) subject).getState();
        System.out.println("[" + name + "]:" + message);
        if (state == -1) {
            System.out.println("[" + name + "]:" + name + " will exit because subject is closed.");
        }
    }
}
