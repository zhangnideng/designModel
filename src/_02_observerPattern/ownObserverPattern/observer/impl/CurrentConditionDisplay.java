package _02_observerPattern.ownObserverPattern.observer.impl;

import _02_observerPattern.ownObserverPattern.object.DisplayElement;
import _02_observerPattern.ownObserverPattern.observer.Observer;
import _02_observerPattern.ownObserverPattern.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay() {
    }

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }


}
