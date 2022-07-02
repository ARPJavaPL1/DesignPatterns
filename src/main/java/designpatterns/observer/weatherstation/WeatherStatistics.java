package designpatterns.observer.weatherstation;

public class WeatherStatistics implements Observer, PrintableItem{

    private double maxTemperature;
    private double minTemperature;
    private double avgTemperature;
    private double sumTemperature;
    private int updateCount;

    private Subject subject;

    public WeatherStatistics(Subject subject) {
        this.subject = subject;

        subject.attach(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        if (updateCount == 0) {
            updateCount++;
            maxTemperature = temperature;
            minTemperature = temperature;
            avgTemperature = temperature;
            sumTemperature = temperature;
            print();

            return;
        }

        updateCount++;

        if (maxTemperature < temperature) {
            maxTemperature = temperature;
        }

        if (minTemperature > temperature) {
            minTemperature = temperature;
        }

        sumTemperature += temperature;
        avgTemperature = sumTemperature / updateCount;

        print();

        if (updateCount >= 2) {
            subject.detach(this);
        }
    }

    @Override
    public void print() {
        System.out.println("Weather stattistics");
        System.out.printf("Max temperature: %7.2f C\n ", maxTemperature);
        System.out.printf("Min temperature: %7.2f C\n", minTemperature);
        System.out.printf("Avg temperature: %7.2f C\n", avgTemperature);
    }
}
