package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		// Object Type to string type 
		
		String s11 = new String("10");
		System.out.println("Object type:" + s11);
		
		
		//to string method
		
		
		String string =s11.toString();
		System.out.println("Approach 1 in to string method: " + string);             // Approach 1
		
		System.out.println("Approach 2 in to string method: " + s11.toString());  // Approach 2
		
		
		
		
		
		//+ Operator method
		
		
		
		s11.toString();
		System.out.println(s11 + " " + string);  //doubt 
		
		System.out.println("Approach 2 in to string method: " + ""+ s11.toString()); //Approach 2
		
		

	}

}
//Key Point
// For converting the object type to string type there are two ways
//1. toString Method()
//2. using +operator
