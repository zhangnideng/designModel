package _02_observerPattern.javaObserverPattern.observer;

import _02_observerPattern.javaObserverPattern.object.DisplayElement;
import _02_observerPattern.javaObserverPattern.subject.WeatherData;
import org.omg.CORBA.Current;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display(){
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
