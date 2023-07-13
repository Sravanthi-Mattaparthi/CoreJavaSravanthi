package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
	
		int a[] = {10, 20, 30, 40 ,50 };
		
		System.out.println(a.length);
		
		System.out.println(a.length + 1);
		System.out.println(a.length - 2);
		System.out.println(a.length * 2);
		System.out.println(a.length / 2);
		System.out.println(a.length);
		
		
		int [] b = new int[0];
		System.out.println(b);
		b[0] = 10;
		System.out.println(b[0]);   //java.lang.ArrayIndexOutOfBoundsException:
//		
//		
//		int [] c = new int[-5];
//		c[-5] = 10;
//		System.out.println(c);  //java.lang.NegativeArraySizeException
//		
		

	}

}
