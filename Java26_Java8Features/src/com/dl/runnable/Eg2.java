package com.dl.runnable;

public class Eg2 {

	public static void main(String[] args) {
		
		//Runnable Interface Using Lambda Expression
		Runnable r = ()->{
			
			for (int i = 0; i < 5; i++) {
				System.out.println("Main Thread");
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
