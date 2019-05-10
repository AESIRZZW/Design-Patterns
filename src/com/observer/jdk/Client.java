package com.observer.jdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Observer
 * @Author: Aesir
 * @Date: 2019/5/10 22:10
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer_1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer_2");
        ConcreteObserver observer3 = new ConcreteObserver("Observer_3");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Random random = new Random();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        for (int i = 0; i < 10; i++) {
            String date = simpleDateFormat.format(new Date());
            subject.setMessage("Current time：" + date);
            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i > 5) {
                subject.deleteObserver(observer3);
            }
        }
        subject.setState(-1);
    }
}
