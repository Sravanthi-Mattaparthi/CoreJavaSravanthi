package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
	// creating object for non static /Instance block 
    // Simply start with new keyword followed with class name;
		
		 new Eg4();

	}
	
	{
		System.out.println("This block is non-static");
	}
	
	{
		System.out.println("Create a object  of the block to get executed ");
	}

}

//While creating a object for instance block there is no need to assign the variable