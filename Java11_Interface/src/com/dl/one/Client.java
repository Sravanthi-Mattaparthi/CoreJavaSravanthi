package com.dl.one;

//In interface we declare all abstract methods  by default they are public and abstract.
//All interface methods need to be implemented in child class
interface Parent{
	void m1();
	void m2();
	public abstract void m3();
	
}

class child implements Parent{

	@Override
	public void m1() {
		System.out.println("M1 method");
	}

	@Override
	public void m2() {
		System.out.println("M2 method");
	}

	@Override
	public void m3() {
		System.out.println("M3 method");
		
	}
		
	
}
public class Client {

	public static void main(String[] args) {
		Parent p = new child();
		p.m1();
		p.m2();
		p.m3();
	}

}

//KeyPoint
//To get the override methods in child class place the cursor on child it shows "Add unimplemented methods
//Also when you take parent class as interface for child class method class before child
