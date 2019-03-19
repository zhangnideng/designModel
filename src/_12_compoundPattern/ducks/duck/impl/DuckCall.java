package _12_compoundPattern.ducks.duck.impl;

import _12_compoundPattern.ducks.duck.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
