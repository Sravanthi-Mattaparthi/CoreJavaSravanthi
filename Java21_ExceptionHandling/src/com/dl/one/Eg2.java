package com.dl.one;

//ArrayOutofBound Exception

public class Eg2 {

	public static void main(String[] args) {
		
	//Exception not handled 
//	System.out.println("Before");
//	int a[]= {10,20,30,40,50};
//	System.out.println(a[0]);
//	System.out.println(a[1]);
//	System.out.println(a[5]); // java.lang.ArrayIndexOutOfBoundsException:
//	System.out.println("After");
//	
	
	//Handling Exception
	try {
		System.out.println("Before");
		int b[]= {10,20,30,40,50};
		//index =  0 1   2  3  4
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[5]); 
		
	}
	catch(ArrayIndexOutOfBoundsException e)
		 {
		System.out.println(e);
		
	}
	System.out.println("After");

	}

}

//KeyPoint
//As the declared size of array holds only 4 indices , beyond it it will throw ArrayOutBound
