package _07_California_Weather;

import java.util.HashMap;

/*
 * See instructions in the CaliforniaWeather.java class
 */
public class CaliforniaWeatherRunner {
    /*this is .start()
     * HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
     // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords( "National City" );
        WeatherData datum = weatherData.get(cityName);
        
        if( datum == null ) {
            System.out.println("Unable to find weather data for: " + cityName);
        } else {
            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
     */
    public static void main(String[] args) {
        new CaliforniaWeather().start();
    }
}
