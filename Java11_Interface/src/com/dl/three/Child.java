package com.dl.three;

public class Child implements Parent {

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//Calling them by class name
		System.out.println(Child.a);
		System.out.println(Child.b);
		System.out.println(Child.c);
		System.out.println(Child.d);
		
		
		System.out.println(Parent.a);
		System.out.println(Parent.b);
		System.out.println(Parent.c);
		System.out.println(Parent.d);
		
		
		
		
	}

}
