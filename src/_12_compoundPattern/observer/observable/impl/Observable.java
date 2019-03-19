package _12_compoundPattern.observer.observable.impl;

import _12_compoundPattern.observer.observable.QuackObservable;
import _12_compoundPattern.observer.observer.Observer;

import java.util.ArrayList;

public class Observable implements QuackObservable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(duck);
        }
    }
}
