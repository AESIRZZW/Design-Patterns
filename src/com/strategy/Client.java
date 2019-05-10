package com.strategy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Strategy
 * @Author: Aesir
 * @Date: 2019/5/10 0:52
 */
public class Client {
    private static final double STANDARD_PRICE = 998;

    public static void main(String[] args) {
        PriceStrategy newCustomerRetailStrategy = new NewCustomerRetailStrategy();
        PriceStrategy newCustomerWholesaleStrategy = new NewCustomerWholesaleStrategy();
        PriceStrategy oldCustomerRetailStrategy = new OldCustomerRetailStrategy();
        PriceStrategy oldCustomerWholesaleStrategy = new OldCustomerWholesaleStrategy();

        Context context = new Context();
        context.setStrategy(newCustomerRetailStrategy);
        System.out.println("new customer retail price = " + context.getPrice(STANDARD_PRICE));
        context.setStrategy(newCustomerWholesaleStrategy);
        System.out.println("new customer wholesale price = " + context.getPrice(STANDARD_PRICE));
        context.setStrategy(oldCustomerRetailStrategy);
        System.out.println("old customer retail price = " + context.getPrice(STANDARD_PRICE));
        context.setStrategy(oldCustomerWholesaleStrategy);
        System.out.println("old customer wholesale price = " + context.getPrice(STANDARD_PRICE));
    }
}
