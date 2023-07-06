package com.dl.five;

public class Child extends Parent {

	@Override
	public void m3() {
		System.out.println("M3 is the method GrandParent implemented in Child");

	}

	@Override
	public void m4() {
		System.out.println("M4 is the method GrandParent implemented in Child");

	}

}

//KeyPoint
//before creating the child class we need to extend the left over methods in parent , so go with inheritance
//click on browse method or on add 