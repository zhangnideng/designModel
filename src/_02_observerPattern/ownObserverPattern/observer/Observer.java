package _02_observerPattern.ownObserverPattern.observer;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
