package _01_strategyPattern.behavior.impl.fly;

import _01_strategyPattern.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'am flying with a rocket!");
    }
}
