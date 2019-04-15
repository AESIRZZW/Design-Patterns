package com.proxy.dynamicproxy;

import com.proxy.dynamicproxy.Star;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Dynamic Proxy
 * @Author: Aesir
 * @Date: 2019/4/7 23:42
 */
public class StarProxy implements Star {

    @Override
    public void confer() {
        System.out.println("StarProxy is conferring.");
    }

    @Override
    public void signContract() {
        System.out.println("StarProxy is signing contract.");
    }

    @Override
    public void bookTicket() {
        System.out.println("StarProxy is booking ticket.");
    }

    /*
     * StarProxy can help RealStar do anything but the core business,
     * which is singing.
     */
    @Override
    public void sing() {
        System.out.println("I can not do this.");
    }

    @Override
    public void collectMoney() {
        System.out.println("StarProxy is collecting money.");
    }
}
