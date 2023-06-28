package com.dl.two;

//Multilevel Inheritance 

class GrandParent{
	public void m1() {
		System.out.println("GrandParent is the method");
	}
}

class Parent extends GrandParent{
	public void m2() {
		System.out.println("Parent is the method");
	}
}

class Child extends Parent{
	public void m3() {
		System.out.println("Child is the method");
	}
}
public class client {
	
	public static void main (String []args) {
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		
	}

}


//KeyPoint
// In Multi-level  inheritance which class uses extend keyword lastly (example: child) we will create object for that particular class only.
// With that object we will call all the methods available in other classes.