package com.dl.one;

public class Eg6 {

	//Checking thread is alive and knowing count of threads
	
	//isAlive() and activeCount()
	
	public static void main(String[] args) {
		
		Thread t1 = new  Thread();
		t1.start();
		System.out.println(t1.isAlive());
		
		Thread t2 = new  Thread();
		t2.start();
		System.out.println(t2.isAlive());
		
		
		System.out.println(Thread.activeCount()); //2
		
		

	}

}
