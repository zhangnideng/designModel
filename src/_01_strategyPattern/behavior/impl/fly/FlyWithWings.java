package _01_strategyPattern.behavior.impl.fly;

import _01_strategyPattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I'm flying!!");
    }
}
