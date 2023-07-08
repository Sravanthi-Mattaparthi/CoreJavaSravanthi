package com.dl.four;
// Example for Private modifier
public class Eg1 {
	      
	//Private variables 
	
	private int id= 101;
	private String userName = "Sravanthi";
	

	public static void main(String[] args) {
		
		System.out.println(new Eg1().id);
		System.out.println(new Eg1().userName);
		

	}

}


//Key Point 
//Private can be accessed within the same class of same package.