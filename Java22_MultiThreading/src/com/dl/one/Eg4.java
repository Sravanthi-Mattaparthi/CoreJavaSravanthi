package com.dl.one;

public class Eg4 extends Thread {

	//Naming the thread using setName 
	
	public static void main(String[] args) {
	
		Eg4 eg4 = new Eg4();
		System.out.println(eg4.getName());
		Thread.currentThread().setName("Custom exception or custom THread Name");
		System.out.println(currentThread().getName());

	}

}
