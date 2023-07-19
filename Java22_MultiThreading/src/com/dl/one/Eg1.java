package com.dl.one;

//current thread 
public class Eg1 {

	public static void main(String[] args) {
		
		//main is the thread
		
		Thread currentThread = Thread.currentThread();
		
		System.out.println(currentThread.getName());      	// main
		System.out.println(currentThread.isAlive());		// true	
		System.out.println(currentThread.getClass());		// class java.lang.Thread
		System.out.println(currentThread.getState());		// RUNNABLE
		
		

	}

}


//KeyPoint
//Using currentThread is used to know the name of the thread, its class , state and whether the thread is alive.