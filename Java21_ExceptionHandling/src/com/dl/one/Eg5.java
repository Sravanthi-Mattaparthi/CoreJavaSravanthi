package com.dl.one;

public class Eg5 {
	
	//StringOutofBound Error

	public static void main(String[] args) {
		
		//Exception not handled 
		
//		System.out.println("Before");
//		String s1 = "Hello Java you are easy to learn";
//		System.out.println(s1.charAt(6));
//		System.out.println(s1.charAt(50));//java.lang.StringIndexOutOfBoundsException
//		System.out.println("After");
		
		//Handling Exception
		 try {
				System.out.println("Before");
				String s2 = "Hello Java you are easy to learn";
				System.out.println(s2.charAt(6));
				System.out.println(s2.charAt(50));
			 
		 }
		 catch(StringIndexOutOfBoundsException e) {
			 System.out.println(e);
			 
		 }
		System.out.println("After");

	}

}

//KeyPoint
//As the mentioned index of given string is out of range it showed an StringIndexOutOfBoundsException.
