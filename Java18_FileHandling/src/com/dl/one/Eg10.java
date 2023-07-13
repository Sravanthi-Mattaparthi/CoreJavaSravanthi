package com.dl.one;

import java.util.Scanner;

public class Eg10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter userName: ");
		String userName = scanner.nextLine();
		//System.out.println(userName);
		
		
		System.out.println("Enter user Salary: ");
		double Salary = scanner.nextDouble();
		//System.out.println(Salary);
		
		
		System.out.println("Enter user Age: ");
		int Age = scanner.nextInt();
		//System.out.println(Age);
	
		scanner.close();
	}

}
