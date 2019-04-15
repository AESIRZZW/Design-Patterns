package com.proxy.dynamicproxy;

import com.proxy.dynamicproxy.Star;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Dynamic Proxy
 * @Author: Aesir
 * @Date: 2019/4/7 23:35
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("Do not disturb me!");
    }

    @Override
    public void signContract() {
        System.out.println("Do not disturb me!");
    }

    @Override
    public void bookTicket() {
        System.out.println("Do not disturb me!");
    }

    @Override
    public void sing() {
        System.out.println("RealStar is singing.");
    }

    @Override
    public void collectMoney() {
        System.out.println("Do not disturb me!");
    }
}
