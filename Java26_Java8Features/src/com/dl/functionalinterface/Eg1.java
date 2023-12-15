package com.dl.functionalinterface;

@FunctionalInterface
interface Varibales {

	public abstract void userData();

}

public class Eg1 implements Varibales {
	
	static String userName = "Sai Kiran";
	static String password = "Admin";

	public static void main(String[] args) {

		new Eg1().userData();
	}

	@Override
	public void userData() {
		
		System.out.println(userName);
		System.out.println(password);
	}

}
