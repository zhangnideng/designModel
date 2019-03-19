package _12_compoundPattern.composite.duckfactory;

import _12_compoundPattern.composite.duck.Quackable;

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
