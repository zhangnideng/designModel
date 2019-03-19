package _02_observerPattern.javaObserverPattern;


import _02_observerPattern.javaObserverPattern.observer.CurrentConditionDisplay;
import _02_observerPattern.javaObserverPattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.3f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
