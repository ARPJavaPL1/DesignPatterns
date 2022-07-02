package designpatterns.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private List<Observer> detached = new ArrayList<>();

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // observers.remove(observer);
        detached.add(observer);
    }

    @Override
    public void notifyStateChange() {
        clearDetached();

        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyStateChange();
    }

    private void clearDetached() {
        if (!detached.isEmpty()) {
            for (Observer o : detached) {
                observers.remove(o);
            }
            detached.clear();
        }
    }
}
