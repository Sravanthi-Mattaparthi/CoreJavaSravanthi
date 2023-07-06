package com.dl.five;

public class Client {

	public static void main(String[] args) {
	
		GrandParent gp = new Child();
		gp.m1();
		gp.m2();
		gp.m3();
		gp.m4();
		
		
		Parent p = new Child();
		p.m1();
		p.m2();
		p.m3();
		p.m4();

		
		
		
	}

}
