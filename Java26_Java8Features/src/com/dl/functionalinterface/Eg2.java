package com.dl.functionalinterface;

import java.util.Scanner;

@FunctionalInterface
interface Login_Poly {

	public abstract void login();

}

class User_Poly implements Login_Poly {

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
}

public class Eg2 {

	public static void main(String[] args) {

		// Polymorphism
		Login_Poly login = new User_Poly();
		login.login();

	}

}
