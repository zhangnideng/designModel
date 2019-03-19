package _12_compoundPattern.composite.duckfactory.impl;

import _12_compoundPattern.composite.duck.Quackable;
import _12_compoundPattern.composite.duck.impl.DuckCall;
import _12_compoundPattern.composite.duck.impl.MallardDuck;
import _12_compoundPattern.composite.duck.impl.RedheadDuck;
import _12_compoundPattern.composite.duck.impl.RubberDuck;
import _12_compoundPattern.composite.duckfactory.AbstractDuckFactory;

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
