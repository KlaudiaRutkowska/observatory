public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new WeatherForecast(weatherData);

        weatherData.setMeasurements(15, 36, 1004);
        weatherData.setMeasurements(18, 38, 1004);
        weatherData.setMeasurements(15, 36, 1004);
        weatherData.setMeasurements(12, 32, 1004);
    }
}
