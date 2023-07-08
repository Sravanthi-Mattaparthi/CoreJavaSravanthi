package com.dl.three;

public class Eg4 extends Eg3 {
	void m2() {
		System.out.println("M2 is a method in same package");
	}
	
	

	public static void main(String[] args) {
		
		Eg4 eg4 =new Eg4();
		eg4.m2();
		eg4.m1();
		
		

	}

}

