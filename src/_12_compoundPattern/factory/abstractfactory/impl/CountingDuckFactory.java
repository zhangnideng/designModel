package _12_compoundPattern.factory.abstractfactory.impl;

import _12_compoundPattern.factory.abstractfactory.AbstractDuckFactory;
import _12_compoundPattern.factory.duck.Quackable;
import _12_compoundPattern.factory.duck.impl.*;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
