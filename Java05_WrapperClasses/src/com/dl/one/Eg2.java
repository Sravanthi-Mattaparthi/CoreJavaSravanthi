package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		//Object type to primitive
		
	Integer i = new Integer(10);
	System.out.println("Objective Type: " + i);
	
	// Para
	
	int intValue = i.intValue();
	System.out.println("Primitive Value:" +intValue);
	
	//Auto un-boxing
	
	Integer ii = i;
	System.out.println("Primitive Value: " + ii);
		

	}

}
