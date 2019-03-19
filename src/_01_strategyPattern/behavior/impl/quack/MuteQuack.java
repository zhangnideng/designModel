package _01_strategyPattern.behavior.impl.quack;

import _01_strategyPattern.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
