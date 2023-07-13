package com.dl.one;

public class Eg6 {

	// accessing multiple array elements
	
	public static void main(String[] args) {
		int a[] [] = {{1 , 2 , 3 , 4 ,5} ,{ 10 , 20, 30, 40 ,50 , 100} , {1000 , 5000, 1000}};
		//			   0   1   2   3  4      0    1   2   3  4	  5         0     1      2
		//					0					   1                               2
		System.out.println(a[0][4]);   //5
		
		System.out.println(a[1][3]);   //40
		
		System.out.println(a[2][2]);   //1000
		

	}

}

//KeyPoint
// If we are giving multiple arrays , then they are separated by comma(,)
//  the first set will be starts from array 0 , then index of that particular element
