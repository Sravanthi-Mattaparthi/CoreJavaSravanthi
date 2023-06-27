package com.dl.four;

public abstract class Parent {
	public Parent() {				//Constructor
		System.out.println("Default Constructor");
		
	}

}


//Inside abstract class we can take constructor but you cannot instantiate it.
//To use the constructor of abstract class we need to have inheritance.
//Example in parent class we have constructor , we create child class and we extend the parent class.
//finally we create object for child class and it will call the parent class constructor
