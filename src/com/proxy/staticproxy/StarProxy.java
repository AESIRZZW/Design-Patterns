package com.proxy.staticproxy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Static Proxy
 * @Author: Aesir
 * @Date: 2019/4/7 23:42
 */
public class StarProxy implements Star {

    /*
     * Reference an Object who needs to be represented.
     */
    private Star star;

    public StarProxy(Star star) {
        this.star = star;
    }

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
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("StarProxy is collecting money.");
    }
}
