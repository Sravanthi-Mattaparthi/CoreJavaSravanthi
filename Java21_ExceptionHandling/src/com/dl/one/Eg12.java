package com.dl.one;

//when catch and finally block both use return keyword
//method will ultimately return value returned by finally block irrespective of value returned by catch block

public class Eg12 {

	public static void main(String[] args) {
		System.out.println(sum());

	}
	
	static String sum() {
		try {
			int a =100;
			System.out.println(a);
			
			
		}
		catch(ArithmeticException e) {
			return "catch block";
		}
		
		finally {
			return "finally block";
		}
	}

}


