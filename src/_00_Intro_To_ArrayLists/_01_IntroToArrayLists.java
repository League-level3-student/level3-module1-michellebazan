package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList <String> names = new ArrayList <String>();
        // 2. Add five Strings to your list
    	names.add("Cali");
    	names.add("Canes");
    	names.add("Pepsi");
    	names.add("No u");
    	names.add("Uno");
        // 3. Print all the Strings using a standard for-loop
    	for(int i = 0; i < names.size(); i++) {
    		System.out.println(names.get(i));
    	}
    	System.out.println("...");
        // 4. Print all the Strings using a for-each loop
    	for(String copy : names) {
    		System.out.println(copy);
    	}
    	System.out.println("...");
        // 5. Print only the even numbered elements in the list.
    	for(int i = 0; i < names.size(); i+=2) {
    		System.out.println(names.get(i));
    	}
        // 6. Print all the Strings in reverse order.
    	System.out.println("...");
    	for(int i = 1; i < names.size(); i+=2) {
    		System.out.println(names.get(i));
    	}
    	System.out.println("...");
        // 7. Print only the Strings that have the letter 'e' in them.
        for(int i = 0; i < names.size(); i++) {
        	if(names.get(i).contains("e")) {
        		System.out.println(names.get(i));
        	}
        }
    }
}
