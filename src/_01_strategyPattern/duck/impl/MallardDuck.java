package _01_strategyPattern.duck.impl;

import _01_strategyPattern.behavior.impl.fly.FlyWithWings;
import _01_strategyPattern.behavior.impl.quack.Quack;
import _01_strategyPattern.duck.Duck;

public class MallardDuck extends Duck {
    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display(){
        System.out.println("I'm a real " + this.getClass().getSimpleName());
    }
}
