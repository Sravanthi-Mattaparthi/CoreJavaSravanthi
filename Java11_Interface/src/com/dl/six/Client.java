package com.dl.six;

public class Client implements ProfileThree{
	@Override
	public void m1() {
	System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method");
		
	}

	@Override
	public void m5() {
		System.out.println("m5 method");
		
	}

	@Override
	public void m6() {
		System.out.println("m6 method");
		
	}


	public static void main(String[] args) {
	ProfileThree t = new Client();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
	t.m5();
	t.m6();

	}
	}
	
