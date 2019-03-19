package _03_decoratePattern.ownDecoratePattern.beverage.decorater.impl;

import _03_decoratePattern.ownDecoratePattern.beverage.Beverage;
import _03_decoratePattern.ownDecoratePattern.beverage.decorater.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
