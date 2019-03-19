package _03_decoratePattern.ownDecoratePattern.beverage;

import _03_decoratePattern.ownDecoratePattern.beverage.decorater.impl.Mocha;
import _03_decoratePattern.ownDecoratePattern.beverage.decorater.impl.Whip;
import _03_decoratePattern.ownDecoratePattern.beverage.impl.Espresso;
import _03_decoratePattern.ownDecoratePattern.beverage.impl.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
