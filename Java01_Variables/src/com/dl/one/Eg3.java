package com.dl.one;

public class Eg3 {
	//Instance Variables/Non static variables. 
		//The variables which are declared inside the class and outside the method is known as Instance variables/Non-static variables
		byte b;
		short s;
		int i;
		long l;
		boolean bb;
		
		double d;
		float f;
		char ch;
			

		public static void main(String[] args) {
			//Object is define as instance of a class
			//Instance is an object
			//Creating object, the syntax is new object(), there object is class name
			//Declaration is given as class name + object reference variable + "="
			// example Eg3 eg3 =new Eg3();
			  Eg3 eg3=new Eg3();
			System.out.println(eg3.b);
			System.out.println(eg3.s);
			System.out.println(eg3.i);
			System.out.println(eg3.l);
			System.out.println(eg3.bb);
			System.out.println(eg3.d);
			System.out.println(eg3.f);
			System.out.println(eg3.ch);

		}


}
