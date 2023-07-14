package com.dl.one;

//throws is written whether the method can throw an exception, throws will be declared with method signature

public class Eg11 {
	
	public static void getName(String name) throws Exception {
		if(name=="Sravanthi") {
			System.out.println("name matched");
		}
		else {
			
			System.out.println("name not matched");
		}
	}
	

	public static void main(String[] args) throws Exception {
		getName("satya");
		

	}

}

//KeyPoint
//Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
//The throws keyword is followed by class names of Exceptions to be thrown.
//throws is used with the method signature.
//We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.