package _12_compoundPattern.observer.observer.impl;

import _12_compoundPattern.observer.observable.QuackObservable;
import _12_compoundPattern.observer.observer.Observer;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
