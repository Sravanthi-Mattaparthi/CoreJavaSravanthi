package com.dl.functionalinterface;

import java.util.Scanner;

@FunctionalInterface
interface Login_Anonymus {

	public abstract void login();

}

public class Eg3 {
    
	//Using Anonymous Implementation
	public static void main(String[] args) {

		Login_Anonymus anonymus = new Login_Anonymus() {
			
			@Override
			public void login() {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter User Name: ");
				String uName = scanner.nextLine();
				System.out.println(uName);
				System.out.println("Enter User Password: ");
				String uPassword = scanner.nextLine();
				System.out.println(uPassword);
				System.out.println("Success");
				scanner.close();
				
			}
		};
		anonymus.login();
	}

}
