package _03_decoratePattern.ownDecoratePattern.beverage.decorater.impl;

import _03_decoratePattern.ownDecoratePattern.beverage.Beverage;
import _03_decoratePattern.ownDecoratePattern.beverage.decorater.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
