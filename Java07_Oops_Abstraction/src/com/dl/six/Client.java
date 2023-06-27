package com.dl.six;

//In abstract class we can declare multiple abstract methods but we can also provide only single method implementation of subclass
//and  all other remaining implementation we can take in another class by using multi-level inheritance

abstract class GrandParent{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
	
}

abstract class Parent extends GrandParent{
	public void m1() {
		System.out.println("M1 method in abstarct Grandparent class implemented in abstract class parent");
	}
	
	public void m2() {
		System.out.println("M2 method in abstarct Grandparent class implemented in abstract class parent");
	}	
}

class Child extends Parent{
	public void m3() {
		System.out.println("M3 method in abstarct Grandparent class implemented in abstract class child");
	}
	public void m4() {
		System.out.println("M4 method in abstarct Grandparent class implemented in abstract class child");
	}
	
}

public class Client {

	public static void main(String[] args) {
		Child child =new Child();
		child.m1();
		child.m2();
		child.m3();
		child.m4();
		
	}

}
