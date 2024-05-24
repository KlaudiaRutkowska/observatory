import java.util.ArrayList;

public class WeatherData implements Subject {
    private double temperature;
    private double pressure;
    private double humidity;
    ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
