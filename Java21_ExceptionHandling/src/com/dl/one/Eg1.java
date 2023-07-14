package com.dl.one;

//Arithmetic Exception
public class Eg1 {

	public static void main(String[] args) {
	
		//Not handling exception 
//		int a=10;
//		int b=50;
//		int c=0;
//		System.out.println("Before the execution");
//		System.out.println(a/b);
//		System.out.println(b/c); //java.lang.ArithmeticException: / by zero
//		System.out.println("After the execution");
		
		
		//Handling Exceptions
		
		try {
			int x =10;
			int y=20;
			int z= 0;
			System.out.println("Before");
			System.out.println(x/y);
 		System.out.println(y/z);
 		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After");
	}

}


//KeyPoint
//Both the codes with exception and without exception is done
