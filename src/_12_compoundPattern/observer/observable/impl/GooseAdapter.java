package _12_compoundPattern.observer.observable.impl;

import _12_compoundPattern.observer.observable.Goose;
import _12_compoundPattern.observer.observable.Quackable;
import _12_compoundPattern.observer.observer.Observer;

public class GooseAdapter implements Quackable {
	private Goose goose;
	private Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
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
		return "Goose pretending to be a Duck";
	}
}
