package WeatherStationApp.Observers;

import WeatherStationApp.Interfaces.Display;
import WeatherStationApp.Interfaces.Observer;
import WeatherStationApp.Interfaces.Subject;

public class StatisticsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Here is the Statistic Display "+ this.temperature + " " + this.humidity);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature = temp;
       this.humidity = humidity;

       display();
    }
}
