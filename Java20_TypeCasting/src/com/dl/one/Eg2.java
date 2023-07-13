package com.dl.one;

//Narrowing / casting up / Explicit Casting

//conversion from higher data type to lower data type

//double->float->long->int->short->byte
//-------------------->char->----------

public class Eg2 {

	public static void main(String[] args) {
		
		double d1 = 100;
		float f1= (float)d1;
		System.out.println(f1);
		
		long l1 = (long)f1;
		System.out.println(l1);
		
		int i1 =(int)l1;
		System.out.println(i1);
		
		short s1=(short)i1;
		System.out.println(s1);
		
		byte b1=(byte)s1;
		System.out.println(b1);
		
		
		double d2= 500;
		byte b2=(byte)d2;
		System.out.println(b2);
		
		long l2 =65;
		char ch1 =(char)l2;
		System.out.println(ch1);
		
		
		long l3=99;
		byte b3 =(byte)(short)(int)(long)(float)(double)l3; //approach1
		System.out.println(b3);
		
		long l4=99;
		byte b4 =(byte)(short)(int)(long)l4; //approach2
		System.out.println(b4);
		
		
		

	}

}
