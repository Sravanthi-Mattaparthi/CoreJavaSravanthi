package com.dl.one;

//Null Pointer Exception
public class Eg3 {

	public static void main(String[] args) {
		
		//Exception not handled 
//		System.out.println("Before");
//		String s1=null;
//		System.out.println(s1.length()); //java.lang.NullPointerException
//		System.out.println("After");
		
		//Handling Exception
		try {
			System.out.println("Before");
			String s1=null;
			System.out.println(s1.length());
			
		}
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("After");
		
	}

}

//KeyPoint
//As the given string is null.For null we can't find length so it is giving NullPointException