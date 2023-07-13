package com.dl.one;

import java.util.Scanner;

public class Eg9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scanner.nextInt();

		
		System.out.println("Enter the second number: ");
		int b = scanner.nextInt();
	
		int c= a+b;
		System.out.println("Sum of two numbers:" +c);
		scanner.close();

	}

}

//KeyPoint
//for taking input from the user basically we consider scanner function
//At the end of the usage of the scanner class , close the scanner.

