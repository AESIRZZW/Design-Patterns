package com.strategy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Strategy
 * @Author: Aesir
 * @Date: 2019/5/9 23:53
 */
public class NewCustomerRetailStrategy implements PriceStrategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("No discount on retail for new customers.");
        double customPrice = (double) Math.round(standardPrice * 100) / 100;
        return customPrice;
    }
}
