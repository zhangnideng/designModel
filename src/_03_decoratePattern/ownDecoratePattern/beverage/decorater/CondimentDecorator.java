package _03_decoratePattern.ownDecoratePattern.beverage.decorater;

import _03_decoratePattern.ownDecoratePattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
