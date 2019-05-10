package com.observer.customize;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Observer
 * @Author: Aesir
 * @Date: 2019/5/10 18:25
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer_1");
        Observer observer2 = new ConcreteObserver("Observer_2");
        Observer observer3 = new ConcreteObserver("Observer_3");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Random random = new Random();

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        for (int i = 0; i < 10; i++) {
            String date = simpleDateFormat.format(new Date());
            ((ConcreteSubject) subject).setMessage("Current time：" + date);
            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i > 5) {
                subject.removeObserver(observer3);
            }
        }
        ((ConcreteSubject) subject).setState(-1);
    }
}
