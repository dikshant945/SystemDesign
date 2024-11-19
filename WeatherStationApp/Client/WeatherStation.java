package WeatherStationApp.Client;

import WeatherStationApp.Observers.CurrentConditionsDisplay;
import WeatherStationApp.Observers.ForecastDisplay;
import WeatherStationApp.Observers.HeatIndexDisplay;
import WeatherStationApp.Observers.StatisticsDisplay;
import WeatherStationApp.Subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
