package com.strategy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Strategy
 * @Author: Aesir
 * @Date: 2019/5/10 0:37
 */
public class OldCustomerRetailStrategy implements PriceStrategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("95% discount on retail for old customers.");
        double customPrice = (double) Math.round(standardPrice * 0.95 * 100) / 100;
        return customPrice;
    }
}
