import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherStatistics implements DisplayElement, Observer {
    private List<Double> temps = new ArrayList<Double>();

    public WeatherStatistics(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        double maxTemp = Collections.max(temps);
        double minTemp = Collections.min(temps);
        double avgTemp = 0;

        for (Double temp : temps) {
            avgTemp += temp;
        }

        avgTemp = avgTemp / temps.size();

        System.out.println("Avg temp: " + avgTemp);
        System.out.println("Max temp: " + maxTemp);
        System.out.println("Min temp: " + minTemp);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temps.add(temperature);
        display();
    }
}
