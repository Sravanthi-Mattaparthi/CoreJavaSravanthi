package com.dl.one;

//infinite for loop in try block , finally block
public class Eg15 {

	public static void main(String[] args) {
	
		try {
			for(;;) {
				System.out.println("Try block - infinte for loop");
			}
		}
		finally {
			System.out.println("Finally block executed");
		}

	}

}
//KeyPoint
//If we have infinite loop in try block , whatever the statement return in try block will be executed infinite times
//Also the finally block will not be executed.
