package com.proxy.staticproxy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Static Proxy
 * @Author: Aesir
 * @Date: 2019/4/7 23:51
 */
public class Client {

    public static void main(String[] args) {

        Star realStar = new RealStar();
        Star proxy = new StarProxy(realStar);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
