package com.strategy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Strategy
 * @Author: Aesir
 * @Date: 2019/5/10 0:38
 */
public class OldCustomerWholesaleStrategy implements PriceStrategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("85% discount on wholesale for new customers.");
        double customPrice = (double) Math.round(standardPrice * 0.85 * 100) / 100;
        return customPrice;
    }
}
