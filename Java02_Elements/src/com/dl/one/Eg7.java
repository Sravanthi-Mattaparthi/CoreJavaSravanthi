package com.dl.one;

public class Eg7 {
	
	public void m1(int a ,int b) { //Instance method with direct parameters calling
		System.out.println(a + " and " + b);
	}
	
	public  static void m2(int x, int y) {
		System.out.println(x + " and " +y);
	}

	public static void main(String[] args) {
		new Eg7().m1(10, 0);
		m2(30,50);

	}

}
