package _07_01_adapterPattern.simpleAdapterPattern.duck.impl;

import _07_01_adapterPattern.simpleAdapterPattern.duck.Duck;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
