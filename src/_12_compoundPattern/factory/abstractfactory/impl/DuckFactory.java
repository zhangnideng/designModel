package _12_compoundPattern.factory.abstractfactory.impl;

import _12_compoundPattern.factory.abstractfactory.AbstractDuckFactory;
import _12_compoundPattern.factory.duck.Quackable;
import _12_compoundPattern.factory.duck.impl.DuckCall;
import _12_compoundPattern.factory.duck.impl.MallardDuck;
import _12_compoundPattern.factory.duck.impl.RedheadDuck;
import _12_compoundPattern.factory.duck.impl.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
