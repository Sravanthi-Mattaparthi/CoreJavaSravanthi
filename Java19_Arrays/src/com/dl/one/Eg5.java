package com.dl.one;

public class Eg5 {
	// for loop , for each using array 

	public static void main(String[] args) {
		
		int a[]= {20,40,60,80,100};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println(" ");
		
		// printing array elements in reverse order
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
			
		}
		
		System.out.println(" ");
		
		
		// array using for each loop 
		for (int i : a) {
		System.out.println(i);
			
		}
		
		
		
	}

}

//KeyPoint

//For each loop write for then control space bar , select for each.