package com.dl.runnable;

class A implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");

		}
	}

}

public class Eg1 extends A {

	public static void main(String[] args) {

		Eg1 eg1 = new Eg1();
		Thread t = new Thread(eg1);
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");

		}
		t.start();

	}
}
