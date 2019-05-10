package com.strategy;

/**
 * @ProjectName: Design Patterns
 * @Description: A Demonstration of Strategy
 * @Author: Aesir
 * @Date: 2019/5/10 0:40
 */
public class Context {
    private PriceStrategy strategy;

    /*
     * The context class is used to decouple the user from the specific algorithm family,
     * so that the algorithm can evolve independently.
     */
    public Context() {
    }

    /*
     * Different strategy instances can also be injected dynamically by IOC if Spring Framework is used here.
     */
    public Context(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public double getPrice(double standardPrice) {
        return strategy.getPrice(standardPrice);
    }
}
