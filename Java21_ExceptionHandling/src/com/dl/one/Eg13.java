package com.dl.one;

//When try and finally block both use return keyword
//method will ultimately return value returned by finally block irrespective of value returned by try block

public class Eg13 {

	public static void main(String[] args) {
		System.out.println(sum());	

	}
	
	static String sum() {
		try {
			int i= 100;
			System.out.println(i);
			return "try block";
			
		}
		finally {
			return "finally block";
		}
	}

}

//KeyPoint
//Even the value of i in try block is executed the return statement of try block is not executed because of finally block
