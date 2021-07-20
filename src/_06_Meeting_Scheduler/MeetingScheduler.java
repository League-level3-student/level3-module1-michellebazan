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
		Schedule available = null;
		// key (day), value (hours)
		// value is an arraylist, holds multiple hours
		// 1:1

		// hashmaps to hold when people are available
		HashMap<String, ArrayList<Integer>> updatedOne = person1.getSchedule();
		HashMap<String, ArrayList<Integer>> updatedTwo = person2.getSchedule();
		
		// specfic hours that are checked
		ArrayList<Integer> hoursOne = new ArrayList();
		ArrayList<Integer> hoursTwo = new ArrayList();
		ArrayList<String> daysOfTheWeek = new ArrayList();
		daysOfTheWeek.add("");
		//if conditions per day in the week. checks hours if true
		if (updatedOne.containsKey("Monday") && updatedTwo.containsKey("Monday")) {
			hoursOne = updatedOne.get("Monday");
			hoursTwo = updatedTwo.get("Monday");
			//for() {
				
			//}
			
		}
		//next time, add days to dotw, loop thru the if condition except change monday to dotw.get(i) or something. 
		//it will loop 7 times since there are 7 days in a week. 
		//inside the if condition, check the hours (arraylists) maybe with a 2nd for loop. then add any available times to Schedule available.
		//***************************************************************************************************
		//***************************************************************************************************
		//***************************************************************************************************
		//*********ignore below. old code will get deleted once i finish this
		//not deleted for now since i may need to reference it

		// }

		// creating arraylists that will hold the keys / days
		/*
		 * ArrayList <String> namesOne = new ArrayList(); ArrayList <String> namesTwo =
		 * new ArrayList(); for (String keys : updatedOne.keySet()) namesOne.add(keys);
		 * for(String keys: updatedTwo.keySet()) namesTwo.add(keys);
		 */

		// to hold the hours
		// int[] hoursOne = new int[updatedOne.keySet().size()];
		// int[] hoursTwo = new int[updatedTwo.keySet().size()];
		// int index = 0;
		// for(ArrayList<Integer> h1 : updatedOne.values())
		// hoursOne[index] = (int) h1;

		// me checking if one has more available days than the other
		//
		/*
		 * int max = 0; if(namesOne.size() <= namesTwo.size()) { max = namesOne.size();
		 */
		// different for loops depending on if statement (checks ^^^^^^^)
		// first for loops thru the first hashmap
		/*
		 * for(int i = 0; i < max; i++) { //loops thru the second hashmap for(int c = 0;
		 * c < namesTwo.size(); c++) { //checks if dates are equal
		 * if(namesOne.get(i).equals(namesTwo.get(c))) { //if dates are equal, check if
		 * time is equal if(updatedOne.get(namesOne.get(i)) ==
		 * updatedTwo.get(namesTwo.get(c))) { ArrayList <Integer> a =
		 * updatedOne.get(namesOne.get(i)); Integer b = a.get(0);
		 * available.addAvailability(namesOne.get(i), b); } } } }
		 */
		// if the 2nd hashmap has more dates than first
		/*
		 * } else { max = namesTwo.size(); //loops thru 2nd hashmap for(int i = 0; i <
		 * max; i++) { //loops thru the first hashmap for(int c = 0; c <
		 * namesOne.size(); c++) { //checks if dates are equal int date2 = c;
		 * while(namesTwo.get(i).equals(namesOne.get(date2))) { //if dates are equal,
		 * check if time is equal if(updatedTwo.get(namesTwo.get(i)) ==
		 * updatedOne.get(namesOne.get(date2))) { ArrayList <Integer> a =
		 * updatedTwo.get(namesTwo.get(i)); Integer b = a.get(0);
		 * //available.addAvailability(namesTwo.get(i), b); } date2++; } } } }
		 */
		// *************************************************************************
		// FOR NEXT TIME:
		/*
		 * this code might have worked if there was only ONE day ex/ mon @ 8. tues @ 2
		 * but the test code has it as this ex/ mon @ 2, mon @ 4, tues @ 3 THEREFORE
		 * adapt the code so it checks all times on a matching day
		 * 
		 * basically plan more before coding. revamp current code. ;-; pain
		 */

		// for(int i = 0; i < 7; i++) {
		// if(person1.getSchedule().containsKey("Monday")) {

		// code a method that returns all times in both schedules or represent when they
		// are both available? maybe both
		// }
		// }
		return available;
	}
}
