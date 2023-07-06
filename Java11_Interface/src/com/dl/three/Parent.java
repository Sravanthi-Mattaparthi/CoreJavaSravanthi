package com.dl.three;

//In interface all the variables must be public static  final by default , we can implement them in different ways

public interface Parent {
	//Static Variable
	
	int a =10;
	int b = 20;
	public static int c = 30;
	public  static final int d = 40;
	

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}

}
//KeyPoint
//In interface whatever the variable we declare by default they will be public static , there is no place for instance variable.
