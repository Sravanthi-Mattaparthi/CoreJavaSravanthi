package com.dl.two;


// Abstract class with static and instance block implementation
public abstract class Parent {
	
	static {
		System.out.println("This is static block in abstract class");
	}
	{
		System.out.println("This is non-static block in abstract class");
	}

	public static void main(String[] args) {
		

	}

}

//KeyPoint :
// 1.Abstract class can implement the static block
// 2.Abstract class don not implement the instance block as for instance block we need to create a object which is not allowed by the abstract class
// 3. In order to implement the instance block using inheritance that is creating child class , inside the child class we can implement the instance block

