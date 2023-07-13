package com.dl.one;

public class Eg2 {
	//Final keyword for methods
	
	public final void m1() {
		System.out.println("m1 method is final");
	}

	public static void main(String[] args) {
		
		Eg2 eg2 = new Eg2(); //Approach 1
		eg2.m1();
		
		new Eg2().m1(); //Approach 2	

	}

}

//KeyPoint
//When your method is declared with final you cannot overridde it.

