package com.observer.customize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Observer
 * @Author: Aesir
 * @Date: 2019/5/10 11:59
 */
public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public boolean registerObserver(Observer observer) {
        return list.add(observer);
    }

    public boolean removeObserver(Observer observer) {
        return list.remove(observer);
    }

    public void notifyAllObserver() {
        Iterator<Observer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(this);
        }
    }
}
