package _03_decoratePattern.ownDecoratePattern.beverage.decorater.impl;

import _03_decoratePattern.ownDecoratePattern.beverage.Beverage;
import _03_decoratePattern.ownDecoratePattern.beverage.decorater.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
