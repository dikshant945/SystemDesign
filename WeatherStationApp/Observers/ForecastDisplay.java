package WeatherStationApp.Observers;

import WeatherStationApp.Interfaces.Display;
import WeatherStationApp.Interfaces.Observer;
import WeatherStationApp.Interfaces.Subject;
import WeatherStationApp.Subjects.WeatherData;

public class ForecastDisplay implements Display, Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Forecast Display Display "+ this.temperature + " " + this.humidity);
    }


    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
