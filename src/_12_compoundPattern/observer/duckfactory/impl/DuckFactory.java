package _12_compoundPattern.observer.duckfactory.impl;

import _12_compoundPattern.observer.duckfactory.AbstractDuckFactory;
import _12_compoundPattern.observer.observable.Quackable;
import _12_compoundPattern.observer.observable.impl.DuckCall;
import _12_compoundPattern.observer.observable.impl.MallardDuck;
import _12_compoundPattern.observer.observable.impl.RedheadDuck;
import _12_compoundPattern.observer.observable.impl.RubberDuck;

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
