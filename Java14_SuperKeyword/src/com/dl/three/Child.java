package com.dl.three;

public class Child extends Parent {
	
	

	public Child() {
		super();
		System.out.println("child default constructor");
	}

	public Child(int a) {
		super(100);
		
	    System.out.println("child parameterized constructor" + a);
	}
	public Child(int a, int b) {
		this(100);	
		System.out.println("child parameterized constructor" + a +" " + b);
	}

	public static void main(String[] args) {
		 new Child();
		 new Child(10,20);
		


	}

}
