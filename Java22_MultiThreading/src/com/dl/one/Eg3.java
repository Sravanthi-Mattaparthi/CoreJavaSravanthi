package com.dl.one;

public class Eg3  implements Runnable {

	//Creating a Thread by implementing Runnable Interface
	
	public static void main(String[] args) {
		Eg3 eg = new Eg3();
		
		Thread t1 = new Thread(eg);
		t1.start();
		
		Thread t2 = new Thread(eg);
		t2.start();
		
		

	}
	public void run() {
		System.out.println("Run Method");
	}

}
//KeyPoint
// As our run method is an instance method , when it is called in static main method we need to create a object for it
//But the runnable cannot invoke the run method even an object is created for the class
//In order to execute the runnable method , we need to create a thread  using new keyword, and that created thread  object will invoke the run method