package com.dl.five;

abstract class parent {
	public parent() {
		System.out.println("Default constructor");
	}
}

class child extends parent{
	public child() {
		System.out.println("child constructor");
	}
}

public class Client {

	public static void main(String[] args) {
		new child();
		

	}

}

//Key point
//If you want to have the parent and child class in same file then we can use another class or we can have main method in child class
//Example: main method is taken in a class called client 
//Or else we can have it in child class also.
