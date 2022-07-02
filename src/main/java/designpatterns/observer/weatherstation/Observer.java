package designpatterns.observer.weatherstation;

// Obserwator
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
