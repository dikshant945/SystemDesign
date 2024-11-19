package WeatherStationApp.Observers;

import WeatherStationApp.Interfaces.Display;
import WeatherStationApp.Interfaces.Observer;
import WeatherStationApp.Interfaces.Subject;

public class CurrentConditionsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Condition Display "+ this.temperature + " " + this.humidity + " " + this.pressure);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}




