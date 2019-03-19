package _12_compoundPattern.observer.observable.impl;

import _12_compoundPattern.observer.observable.Quackable;
import _12_compoundPattern.observer.observer.Observer;

public class QuackCounter implements Quackable {
	private Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}
	@Override
	public String toString() {
		return duck.toString();
	}
}
