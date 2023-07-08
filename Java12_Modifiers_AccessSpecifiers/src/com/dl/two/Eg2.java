package com.dl.two;

import com.dl.one.Eg1;

public class Eg2 {
	public void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
	Eg2 eg2 =new Eg2();
	eg2.m2();
	
	Eg1 eg1 = new Eg1();
	eg1.m1();

	}

}


//Keypoint 
// for "public" modifier it can be access class, method within same package , or different packages also
//Simply it can be accessed anywhere.