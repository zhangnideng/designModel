package _01_strategyPattern;

import _01_strategyPattern.behavior.impl.fly.FlyRocketPowered;
import _01_strategyPattern.duck.Duck;
import _01_strategyPattern.duck.impl.MallardDuck;
import _01_strategyPattern.duck.impl.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
