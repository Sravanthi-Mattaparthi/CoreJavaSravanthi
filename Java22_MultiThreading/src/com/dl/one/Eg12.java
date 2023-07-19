package com.dl.one;

//Synchronized block

class M extends Thread{
	public void m1() {

		for (int i = 0; i <=5; i++) {
			System.out.println(i + " Non Synchronized Area: ");

		}
		
    synchronized(this) {
    	for (int i = 6; i <10; i++) {
			System.out.println(i + " Synchronized Area:");

    }
    	
    }
		
	}
}
public class Eg12 extends Thread {
	
	M m;
	
	public Eg12(M m) {
		super();
		this.m = m;
	}
	public void run() {
		m.m1();
	}


	public static void main(String[] args) {
		
		M m2 = new M();
		
		Eg12 eg12 = new Eg12(m2);
		eg12.start();
		
		
	}

}
