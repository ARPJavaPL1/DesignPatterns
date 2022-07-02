package designpatterns.observer.weatherstation;

public class CurrentWeather implements Observer, PrintableItem {

    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        print();
    }

    @Override
    public void print() {
        System.out.println("Current weather:");
        System.out.printf("Temperature: %7.2f Celcius\nHumidity: %10.2f Percent\n\n", temperature, humidity);
    }
}
