package com.dl.two;

// values method , valueOf method and ordinal method
enum weeks{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY;
}

public class Client {

	public static void main(String[] args) {
	 
		
		 weeks valueOf = weeks.valueOf("FRIDAY");		//valueOf method
		 System.out.println(valueOf);
		 
		weeks[] values = weeks.values();				//values method
		for (weeks w1 :values) {
		System.out.println(w1);
		
		System.out.println(w1.ordinal());				//ordinal method
			
		
		
		}
	}
}
		

		
		



//KeyPoint
//To implement values method we have to write for each loop
//The values() method returns an array containing all the values of the enum.
// The valueOf() method returns the value of given constant enum.
//The ordinal() method returns the index of the enum value.

// to get line 18 , type weeks.values() then ctrl 1 it will automatically assign the variable