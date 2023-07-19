package com.dl.one;

//thread can be created using two ways
//using thread class and using by runnable 
//class should extends the thread class

public class Eg2  extends Thread{

	//Creating a thread by extending Thread class
	public static void main(String[] args) {
	
		Eg2 eg2 = new Eg2();
		eg2.start();
		
	    Eg2 eg3 = new Eg2();
	    eg3.start();

	}
	
	public void run() {
		System.out.println("Run method");
	}

}

//KeyPoint
//Thread class inbuilt has a run method, if we give run method explicitly then it overrides the the run method which is already in thread class
//To implement the run method which is given explicitly then we need to use start() method.