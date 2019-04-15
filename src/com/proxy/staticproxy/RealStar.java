package com.proxy.staticproxy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Static Proxy
 * @Author: Aesir
 * @Date: 2019/4/7 23:35
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar is conferring.");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar is signing contract.");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar is booking ticket.");
    }

    @Override
    public void sing() {
        System.out.println("RealStar is singing.");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar is collecting money.");
    }
}
