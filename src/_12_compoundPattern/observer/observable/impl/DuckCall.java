package _12_compoundPattern.observer.observable.impl;

import _12_compoundPattern.observer.observable.Quackable;
import _12_compoundPattern.observer.observer.Observer;

public class DuckCall implements Quackable {
	private Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
    @Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
    @Override
	public String toString() {
		return "Duck Call";
	}
}
