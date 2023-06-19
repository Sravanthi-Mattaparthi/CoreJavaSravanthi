package com.dl.one;

public class Eg5 {
	//Writing program  having Static variables, Non-Static Variables/Instance Variable along with
			// Static block and Instance block
			
	 String userName= "Sravanthi";      // Instance Variable
	 String contactNo = "9988776655";   // Instance Variable
	 static String address ="Vizag";    // Static variable
	 
	public static void main(String[] args) {
		System.out.println("Main method: "  +  new Eg5().userName);
		System.out.println("Main method: "  + new Eg5().contactNo);
		System.out.println("Main method: "  + address);
		System.out.println("");
		getdetails1();
		new Eg5().getdetails2();
		
			 	

	}
	public static void getdetails1() { // static method
		System.out.println("static method: " + new Eg5().userName);
		System.out.println("static method: " + new Eg5().contactNo);
		System.out.println("static method: " + address);
		System.out.println("");
	}
	public void getdetails2() { // Instance method
		System.out.println("Instance method: " + userName);
		System.out.println("Instance method: " + contactNo);
		System.out.println("Instance method: " + address);
		System.out.println("");
		
		
	}

}
