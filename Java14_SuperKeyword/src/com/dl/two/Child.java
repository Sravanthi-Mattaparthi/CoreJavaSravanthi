package com.dl.two;

public class Child extends Parent {
	public void methods() {
		System.out.println();
		super.m1();
		super.m2();
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.methods();
			

	}
}
//keypoint 
//In child class we crate objects for parent class and we are calling them using super keyword 