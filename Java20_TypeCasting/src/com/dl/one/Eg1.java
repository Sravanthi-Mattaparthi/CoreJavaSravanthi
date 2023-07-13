package com.dl.one;

//Widening / casting down / Implicit Casting

//conversion from lower data type to higher data type

//byte->short->int->long->float->double
//           ->char->

public class Eg1 {

	public static void main(String[] args) {
		
		byte b1 =10;
		System.out.println(b1);
		
		short s1 =b1;
		System.out.println(s1);
		
		int i1 = s1;
		System.out.println(i1);
		
		long l1=i1;
		System.out.println(l1);
		
		float f1=l1;
		System.out.println(f1);
		
		double d1=f1;
		System.out.println(d1);
		
		
		char ch1 ='A';
		int i2=ch1;
		System.out.println(i2); //ASCII code 65 = A
		
		
		int i3 = 20;
		double d2 = i3;
		System.out.println(d2);
		
		int a =10;
		int b=20;
		long l2= (a+b);
		System.out.println(l2);
		
		
		
	
		
		
		
		//int i3 = 30;
		//short s2 =i3; //type mismatch cannot convert from int to short
		

		

	}

}


//KeyPoint
//Type casting is nothing but converting one data type to other data type.
//Conversion can happen from selected data type of order , and process takes in forward direction
//you cannot come back before the selected data type 
//last example cannort convert int to short, as int is higher data type then short , so the conversion is not possible as it is from lower to higher
//the conversion between numeric data type to char or Boolean is not done automatically. Also, the char and Boolean data types are not compatible with each other.
