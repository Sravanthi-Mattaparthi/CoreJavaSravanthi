package com.dl.one;

public class Eg9 extends Thread {
	//Calling objects one by one using join method
	//join() - meaning wait
	
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

	public static void main(String[] args) throws InterruptedException {
		
		Eg9 eg1 = new Eg9();
		Eg9 eg2 = new Eg9();
		Eg9 eg3 = new Eg9();
		
		eg1.start();
		Thread.currentThread().getName();
		eg1.join();
		
		eg2.start();
		Thread.currentThread().getName();
		eg2.join();
		
		eg3.start();
		Thread.currentThread().getName();
		eg3.join();
		
		
	}

}

//KeyPoint
//When join method is used the main method we need to throws the InterruptedException , then only the code works
