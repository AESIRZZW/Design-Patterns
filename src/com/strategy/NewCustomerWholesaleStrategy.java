package com.strategy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Strategy
 * @Author: Aesir
 * @Date: 2019/5/9 23:57
 */
public class NewCustomerWholesaleStrategy implements PriceStrategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("90% discount on wholesale for new customers.");
        double customPrice = (double) Math.round(standardPrice * 0.90 * 100) / 100;
        return customPrice;
    }
}
