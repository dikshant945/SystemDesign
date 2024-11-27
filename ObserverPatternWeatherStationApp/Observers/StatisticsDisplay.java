package ObserverPatternWeatherStationApp.Observers;

import ObserverPatternWeatherStationApp.Interfaces.Display;
import ObserverPatternWeatherStationApp.Interfaces.Observer;
import ObserverPatternWeatherStationApp.Subjects.WeatherData;

public class StatisticsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Here is the Statistic Display "+ this.temperature + " " + this.humidity);
    }


    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.humidity = weatherData.getHumidity();
       display();
    }
}
