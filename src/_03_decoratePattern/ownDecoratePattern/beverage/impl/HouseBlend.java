package _03_decoratePattern.ownDecoratePattern.beverage.impl;

import _03_decoratePattern.ownDecoratePattern.beverage.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost(){
        return 0.89;
    }
}
