package _02_observerPattern.ownObserverPattern.subject;

import _02_observerPattern.ownObserverPattern.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
