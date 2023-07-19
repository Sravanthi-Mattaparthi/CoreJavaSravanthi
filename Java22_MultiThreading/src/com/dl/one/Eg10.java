package com.dl.one;
//yield method

class A extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("A " + i);
			Thread.yield();
		
		}
	}
}
class B extends Thread {

	public void run() {

		for (int i = 6; i < 10; i++) {
			System.out.println("B " + i);
			Thread.yield();
		}
		
	}
}
public class Eg10 {
	public static void main(String[] args) {
		Thread a = new A();
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();
		Thread b = new B();
		b.setPriority(Thread.MAX_PRIORITY);
		b.start();
	}
}

//KeyPoint
//Yield() will stop executing the current thread and gives priority to the waiting threads
//If the waiting threads have same and low priorities then current thread will be executed.
//Also if there is no waiting  thread , current thread will be executed
//If the waiting thread has high priority then , current thread will stop execution and the high priority thread will be executed