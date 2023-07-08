package com.dl.three;
//Example for Default modifier 

public class Eg3 {
	void m1() {
		System.out.println("M1 is method");
	}
	

	public static void main(String[] args) {
		Eg3 eg3 =new Eg3();
		eg3.m1();

	}

}


//Key point 

//Default modifier will work in within same package only . 