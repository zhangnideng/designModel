package _12_compoundPattern.observer.duckfactory.impl;

import _12_compoundPattern.observer.duckfactory.AbstractDuckFactory;
import _12_compoundPattern.observer.observable.Quackable;
import _12_compoundPattern.observer.observable.impl.*;

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
