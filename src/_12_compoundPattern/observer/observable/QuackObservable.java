package _12_compoundPattern.observer.observable;

import _12_compoundPattern.observer.observer.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
