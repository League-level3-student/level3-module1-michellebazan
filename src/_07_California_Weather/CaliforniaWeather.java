package _07_California_Weather;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 °F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature °F = 65.0, max temperature °F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather {

	void start() {
		HashMap<String, WeatherData> weatherData = Utilities.getWeatherData(); 
		//***** the hashmap is right here look up ******* 

		// All city keys have the first letter capitalized of each word
		// JOptionPane.showInputDialog("")
		String ans = JOptionPane.showInputDialog(
				"Type 'A' to search by city name, 'B' to search by weather condition or 'C' to seach with a min. and max. temp..");
		if (ans.equalsIgnoreCase("A")) {
			// part 1
			String cityName = Utilities.capitalizeWords(JOptionPane.showInputDialog("Input City Name Here"));
			WeatherData datum = weatherData.get(cityName);

			if (datum == null) {
				System.out.println("Unable to find weather data for: " + cityName);
			} else {
				System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of "
						+ datum.temperatureF + " F");
			}
		}

		if (ans.equalsIgnoreCase("B")) {
			// part 2 - Create a way for the user to specify the weather condition and then list the cities that have those conditions.
			String summary = Utilities.capitalizeWords(JOptionPane.showInputDialog("Input Summary Of Weather Here"));
			int change = 0;
			int temp = 0;
			int check = 0;

			for(WeatherData one: weatherData.values()) {
				
				if(one.weatherSummary.equals(summary)) {
					
					for(String two: weatherData.keySet()) {
						if(change == 0) {
							System.out.println(two);
							check++;
							change = temp;
							break;
						}
						change--;
					}
					
				} 
				
				change++;
				temp = change;
			}
		
			
			if(check == 0) {
				System.out.println("Unable to find cities that match " + summary);
			}
			
		}

		//if (ans.equals('C')) {
			// part 3
		//}
		
	}
}
