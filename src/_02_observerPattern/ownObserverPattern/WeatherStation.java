package _02_observerPattern.ownObserverPattern;

import _02_observerPattern.ownObserverPattern.observer.impl.CurrentConditionDisplay;
import _02_observerPattern.ownObserverPattern.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.3f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
