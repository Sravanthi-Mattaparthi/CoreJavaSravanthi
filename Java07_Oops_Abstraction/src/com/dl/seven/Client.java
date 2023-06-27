package com.dl.seven;

//We can implement non-abstract class from abstract class using multilevel inheritance

class p1{ //Non abstract class
	public void m1() {
		System.out.println("m1 is method in non-abstract class");
	}
}

abstract class p2 extends p1{
	public void m2() {
		System.out.println("m2 is method in abstract class");
	}
}

class p3 extends p2{
	public void m3() {
		System.out.println("m3 is method in non-abstarct class");
	}
}

public class Client {

	public static void main(String[] args) {
		
		p3 P3= new p3();
		P3.m1();
		P3.m2();
		P3.m3();
	

	}

}
