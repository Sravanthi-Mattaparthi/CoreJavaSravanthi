package com.dl.one;

public class Eg8 extends Thread {


	///calling three objects at a time
	public void run() {
		for (int i =0; i<5; i++) {
			
			try {
				Thread.sleep(2000);
				System.out.println(i);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
	}
	//Thread sleep method
	public static void main(String[] args) {
		
		Eg8 eg1 = new Eg8();
		Eg8 eg2 = new Eg8();
		Eg8 eg3 = new Eg8();
		
		eg1.start();
		Thread.currentThread().getName();
		
		eg2.start();
		Thread.currentThread().getName();
		
		eg3.start();
		Thread.currentThread().getName();
		
		
		
		

	}

}
