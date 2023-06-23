package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		//Primitive to object //3 ways
		
		int i =10;
		System.out.println("Primitive Type: " +i);
		
		
		//parameterized constructor
		
		Integer integer = new Integer(i);
		System.out.println("Objective Type:" +integer);
		
		//valueOf()
		Integer valueOf = Integer.valueOf(i);
		System.out.println("Objective Type:" +valueOf);
		
		//Auto boxing
		Integer ii=i;
		System.out.println("Objective Type:" +ii);
		
	}
}
