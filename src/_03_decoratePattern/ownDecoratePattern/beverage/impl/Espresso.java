package _03_decoratePattern.ownDecoratePattern.beverage.impl;

import _03_decoratePattern.ownDecoratePattern.beverage.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        description = this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
