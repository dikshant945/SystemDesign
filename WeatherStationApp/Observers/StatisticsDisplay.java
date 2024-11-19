package WeatherStationApp.Observers;

import WeatherStationApp.Interfaces.Display;
import WeatherStationApp.Interfaces.Observer;
import WeatherStationApp.Subjects.WeatherData;

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
