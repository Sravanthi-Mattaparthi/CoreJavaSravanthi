package com.dl.two;

public class Child implements Parent {

	@Override
	public void m1() {
		System.out.println("M1 method in parent class");

	}

	@Override
	public void m2() {
		System.out.println("M2 method in parent class");

	}

	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
		p.m2();
		

	}

}

//For inheritance we use browse option
//For interface we use add the corresponding  class