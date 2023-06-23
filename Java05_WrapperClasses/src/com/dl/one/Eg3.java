package com.dl.one;


public class Eg3 {

	public static void main(String[] args) {
		//String type to Object
		
		String s1 = "Sravanthi";
		System.out.println("Primitive Type: " + s1);
		
		
		String valueOf =s1.valueOf(s1);
		System.out.println("Object Type: " +valueOf); //  value of method()

		
		
		String s2 = new String(s1);
		System.out.println("Object Type:" + s2); // Parameterized constructor method
	}

}

//KeyPoint
//From string type to object type we have two type of conversion
//1. Using Parameterized Constructor
//2. Using valueOf()method
