package com.dl.three;
// Abstract class with static , Instance and Local Variables 
public abstract class Parent {
	static int i  =10;
	static int j= 20;  			//static variables
	
	
	int a =100;
	int b= 200;			//Instance variable

	public static void main(String[] args) {
		int x = 1000;
		int y =2000;
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println(i);
		System.out.println(j);
		
		
		

	}

}
