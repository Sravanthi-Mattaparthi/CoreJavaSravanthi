package com.dl.one;

@Deprecated
class A{
	
	int a = 10;
	
	public void m1() {
		System.out.println("M1 Method");
	}
	
	public void m2() {
		System.out.println("M2 Method");
	}
	
	public void m3() {
		System.out.println("M3 Method");
	}
}

public class Eg2 {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		
		System.out.println(a.a);
	}
}
