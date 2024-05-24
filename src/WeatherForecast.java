public class WeatherForecast implements DisplayElement, Observer {

    private double lastPressure = 0;
    private double currentPressure = 0;
    private Subject weatherData;

    public WeatherForecast(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void unregister() {
        weatherData.removeObserver(this);
        weatherData = null;
    }

    public void register(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if(lastPressure == 0) {
            return;
        }

        if(currentPressure < lastPressure) {
            System.out.println("Pogoda się pogarsza");
        }

        if(currentPressure > lastPressure) {
            System.out.println("Pogoda się polepsza");
        }
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.lastPressure = this.currentPressure;
        this.currentPressure = pressure;
        display();
    }
}
