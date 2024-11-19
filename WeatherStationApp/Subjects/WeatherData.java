package WeatherStationApp.Subjects;

import WeatherStationApp.Interfaces.Observer;
import WeatherStationApp.Interfaces.Subject;

import java.util.ArrayList;


public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }


    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
        System.out.println("Added Observer ");
    }

    @Override
    public void removeObserver(Observer ob) {
       observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Object observer : observers) {
            Observer ob = (Observer) observer;
            ob.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
