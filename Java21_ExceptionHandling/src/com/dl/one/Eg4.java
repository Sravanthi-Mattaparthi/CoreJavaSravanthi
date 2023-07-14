package com.dl.one;

//NumberFormatException

public class Eg4 {

	public static void main(String[] args) {
		
		//Exception not handled 
//		System.out.println("Before");
//		String s1 ="Ten";
//		int parseInt = Integer.parseInt(s1);
//		System.out.println(parseInt); // java.lang.NumberFormatException
//		System.out.println("After");
	
		
		//Handling Exception
		
		try {
			System.out.println("Before");
			String s1 ="Ten";
			int parseInt = Integer.parseInt(s1);
			System.out.println(parseInt);
			
		}
		catch(NumberFormatException e){
			System.out.println(e);
			
		}
		
		System.out.println("After");

	}

}


//KeyPoint
//Here we passes the ten as a string , and converting the ten which is in word format into integer is not possible , if we give as 10 then it will possible
