package _12_compoundPattern.observer.observer;

import _12_compoundPattern.observer.observable.QuackObservable;

public interface Observer {
	void update(QuackObservable duck);
}
