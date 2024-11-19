package WeatherStationApp.Observers;

import WeatherStationApp.Interfaces.Display;
import WeatherStationApp.Interfaces.Observer;
import WeatherStationApp.Interfaces.Subject;
import WeatherStationApp.Subjects.WeatherData;

public class CurrentConditionsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    private final WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Condition Display "+ this.temperature + " " + this.humidity + " " + this.pressure);
    }


    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}




