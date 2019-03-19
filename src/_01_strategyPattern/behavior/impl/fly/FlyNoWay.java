package _01_strategyPattern.behavior.impl.fly;

import _01_strategyPattern.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I can't fly");
    }
}
