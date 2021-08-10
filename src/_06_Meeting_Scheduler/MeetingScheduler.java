package _06_Meeting_Scheduler;

import java.util.ArrayList;
import java.util.HashMap;

public class MeetingScheduler {
	/*
	 * Your task is to code a method to find a meeting time for two people given
	 * their schedules.
	 * 
	 * Code the method below so that it returns a Schedule object that contains all
	 * the times during the week that are in BOTH people's schedules. The Schedule
	 * class is included in this package.
	 * 
	 * Example: person1 availability - Monday at 9, Tuesday at 14, and Friday 10
	 * person2 availability - Tuesday at 14, Friday 8, and Monday at 9 The returned
	 * HashMap should contain: Tuesday 14 and Monday 9
	 * 
	 * The returned Schedule object represents the times both people are available
	 * for a meeting.
	 * 
	 * Time availability is always at the top of the hour, so 9:30 is not valid Time
	 * availability always represents 1 hour Assume both schedules are in the same
	 * time zones
	 */
	public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
		// answer variable
		Schedule available = new Schedule();
		// key (day), value (hours)
		// value is an arraylist, holds multiple hours
		// 1:1

		// hashmaps to hold when people are available
		HashMap<String, ArrayList<Integer>> updatedOne = person1.getSchedule();
		HashMap<String, ArrayList<Integer>> updatedTwo = person2.getSchedule();
		
		for (String day : updatedOne.keySet()) {
			ArrayList<Integer> one = updatedOne.get(day);
			ArrayList<Integer> two = updatedTwo.get(day);
			
			for(int i = 0; i < one.size(); i++) {
				if( two.contains(one.get(i))) {
					available.addAvailability(day, one.get(i));
				}
			}
		}
		
		
/*
		// something that holds the strings of the days of the week
		ArrayList<String> daysOfTheWeek = new ArrayList();
		daysOfTheWeek.add("Monday");
		daysOfTheWeek.add("Tuesday");
		daysOfTheWeek.add("Wednesday");
		daysOfTheWeek.add("Thursday");
		daysOfTheWeek.add("Friday");
		daysOfTheWeek.add("Saturday");
		daysOfTheWeek.add("Sunday");
		int c = 0;
		ArrayList<Integer> hourTwo;
		//first for loop to go through every day of the week
		for (int i = 0; i < daysOfTheWeek.size(); i++) {
			//suppose to check if on that day, there are hours available.
			if (updatedOne.get(daysOfTheWeek.get(i)).isEmpty() != true && updatedTwo.get(daysOfTheWeek.get(i)).isEmpty() != true){ 
				// returns true if empty
				//if person one's has more (or the same) hours as person two
				if(updatedOne.get(daysOfTheWeek.get(i)).size() >= updatedTwo.get(daysOfTheWeek.get(i)).size()) {
					
					while(c < updatedTwo.get(daysOfTheWeek).size()) {
					hourTwo = updatedTwo.get(daysOfTheWeek.get(c));

					for(int j = 0; j < updatedOne.values().size(); j++) {
						ArrayList <String> hr = (ArrayList<String>) updatedOne.values().toArray()[j];
						ArrayList <String> hr2 = (ArrayList<String>) updatedTwo.values().toArray()[j]; 
						//The toArray() method of ArrayList is used to return an array containing all the elements in ArrayList in the correct order.
						//so it should return the hours in the correct order (?)
						if( updatedOne.get(daysOfTheWeek.get(j)) == hourTwo ) { //if  the hour being checked is equal to the other person's hour
							int newHour = Integer.valueOf(hr.get(i));
							available.addAvailability(daysOfTheWeek.get(i), newHour);
						}
							
					}
					c++;
					}
					c = 0;
					//if person two has more hours than person one
				} else { //ignore this half until figure out how to do the first half ---
					System.out.println("else");
					/*
					hourOne = updatedOne.get(daysOfTheWeek.get(i));
					for(ArrayList<Integer> hr: updatedTwo.values()) {
						if(hourTwo.contains(hr)) {
							
						}
					}
					*/
		/*
					c = 0;
				}
				
				
			}
		}
*/
		// 
		// inside the if condition, check the hours (arraylists) maybe with a 2nd for
		// loop. then add any available times to Schedule available.
		// ***************************************************************************************************
		//System.out.println(available);
		
		return available;
	}
}
