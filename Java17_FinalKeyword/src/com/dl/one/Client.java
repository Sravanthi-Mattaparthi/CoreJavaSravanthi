package com.dl.one;

 final class Parent {
	
	public void m1() {
		System.out.println("final class method");
	}
	
	
	
class child extends Parent{
	
}
 }
public class Client{
	public static void main(String[] args) {
		

	}

}
//KeyPoint
//If you make any class as final, you cannot extend it.