package _01_strategyPattern.duck.impl;

import _01_strategyPattern.behavior.impl.fly.FlyNoWay;
import _01_strategyPattern.behavior.impl.quack.Quack;
import _01_strategyPattern.duck.Duck;

public class ModelDuck extends Duck {
    public ModelDuck(){
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
