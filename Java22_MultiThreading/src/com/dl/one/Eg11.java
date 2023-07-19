package com.dl.one;

//Synchronized method.

	class X extends Thread{
		public synchronized void m1() {
			for(int i=0; i<5;i++) {
				System.out.println(i + " " + Thread.currentThread().getName());
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	class Y extends Thread{
		X x; //HAS a relationship

		public Y(X x) {  				// Creating these lines by constructor using fields
			super();
			this.x = x;
		}
		public void run() {  			//using m1 method which is synchronized
			x.m1();
		}
	}
	
	class Z extends Thread{
		X x;

		public Z(X x) {
			super();
			this.x = x;
		}
		public void run() {
			x.m1();
		}
	}
	public class Eg11 extends Thread {
		
	X x;
	
	public Eg11(X x) {
		super();
		this.x = x;
	}
	public void run () {
		x.m1();
	}

	public static void main(String[] args) {
		
		X xx = new X();
		Y y = new Y(xx);
		Z z = new Z(xx);
	
		
		y.start();
		z.start();
		

	}

}
//KeyPoint
//Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
