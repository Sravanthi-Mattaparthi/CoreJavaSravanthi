package com.dl.one;

public class Parent{
	public void add() {
		System.out.println("ADD is a method");
	}
	
	public static void main (String[] args) {
		Child child = new Child();
		child.add();
		child.put();
	}	
	}

 class Child extends Parent{
	public void put() {
		System.out.println("PUT is a method");
	}
}
	
//KeyPoint 
 // Whatever the class you are making public(parent) within that class your main method should be there.



