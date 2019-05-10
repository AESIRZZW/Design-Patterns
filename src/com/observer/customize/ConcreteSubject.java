package com.observer.customize;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Observer
 * @Author: Aesir
 * @Date: 2019/5/10 18:11
 */
public class ConcreteSubject extends Subject {
    private String message;
    private int state;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.notifyAllObserver();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }
}
