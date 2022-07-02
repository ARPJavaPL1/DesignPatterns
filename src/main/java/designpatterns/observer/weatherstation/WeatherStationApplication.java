package designpatterns.observer.weatherstation;

public class WeatherStationApplication {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentWeather currentWeather = new CurrentWeather();
        WeatherStatistics weatherStatistics
                = new WeatherStatistics(weatherStation);

        weatherStation.attach(currentWeather);
        // weatherStation.attach(weatherStatistics);

        weatherStation.setWeatherData(35, 32.4f, 1006);
        weatherStation.setWeatherData(25, 52.4f, 1010);
        weatherStation.setWeatherData(26, 42.4f, 1012);
    }
}
