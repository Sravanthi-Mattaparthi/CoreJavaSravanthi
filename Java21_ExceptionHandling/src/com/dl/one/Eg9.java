package com.dl.one;

//try block with different no of exceptions and single catch block
public class Eg9 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 20;
			int c = 0;
			System.out.println(a / b);
	//		System.out.println(a / c);

			int aa[] = { 10, 20, 30, 40, 50 };
			System.out.println(aa[0]);
			System.out.println(aa[4]);
			System.out.println(aa[5]);       //java.lang.ArithmeticException

			String s1 = null;
			//System.out.println(s1.length()); // java.lang.NullPointerException

			String s11 = "10";
			int parseInt = Integer.parseInt(s11);
			System.out.println(parseInt);

			String s111 = "Hello Java and Hello Python";
			System.out.println(s111.charAt(11));
			//System.out.println(s111.charAt(30)); // StringIndexOutOfBoundsException

		} catch (Exception e) {
			System.out.println("Exception is: " + e);
			
	}

	}

}

//KeyPoint
//Here we doesn't need to mention the each every exception in catch block
//For all the different types of exceptions the complier will automatically mentions the which type of exception is being occurred .
