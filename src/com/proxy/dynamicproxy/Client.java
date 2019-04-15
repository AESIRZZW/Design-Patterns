package com.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Dynamic Proxy
 * @Author: Aesir
 * @Date: 2019/4/8 0:27
 */
public class Client {

    public static void main(String[] args) {

        Star realStar = new RealStar();
        Star starProxy = new StarProxy();
        StarHandler handler = new StarHandler(realStar,starProxy);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
