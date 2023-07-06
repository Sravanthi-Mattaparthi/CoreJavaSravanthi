package com.dl.four;

public class Child implements GrandParent, Parent {

	@Override
	public void m1() {
		System.out.println("M1 method is from GrandParent");
		

	}

	@Override
	public void m2() {
		System.out.println("M2 method is from GrandParent");

	}
	@Override
	public void m3() {
		System.out.println("M3 method is from Parent");

	}

	@Override
	public void m4() {
		System.out.println("M4 method is from Parent");
		

	}



	public static void main(String[] args) {
		GrandParent gp = new Child();
		gp.m1();
		gp.m2();
		
		
		Parent p = new Child();
		p.m3();
		p.m4();

	}

}

//KeyPoint
//For adding the both interfaces of GrandParent and Parent to child  click on add while creating the child class for implementation
//When implementing multiple inheritance the object should be created for the classes that are extending the properties of other classes
//Ex Child and parent class extracts the  properties of GrandParent, so create objects for GrandParent and Parent also
