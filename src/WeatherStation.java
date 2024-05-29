public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new WeatherForecast(weatherData);
        new WeatherStatistics(weatherData);

        weatherData.setMeasurements(15, 36, 1004);
        weatherData.setMeasurements(18, 38, 1004);
        weatherData.setMeasurements(24, 36, 1004);
        weatherData.setMeasurements(12, 32, 1004);
        weatherData.setMeasurements(9, 32, 1004);
        weatherData.setMeasurements(36, 32, 1004);
        weatherData.setMeasurements(22, 32, 1004);
        weatherData.setMeasurements(40, 32, 1004);
        weatherData.setMeasurements(-4, 32, 1004);
    }
}
