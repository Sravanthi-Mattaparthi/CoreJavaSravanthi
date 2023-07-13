package com.dl.one;

//Declare a array and provide elements

public class Eg1 {

	public static void main(String[] args) {
		
	 int a[]= {100,200,300,400,500};
	 
	 System.out.println(a.length); //length of array is 5
	 
	 System.out.println(a[0]); //100
	 System.out.println(a[1]);//200
	 System.out.println(a[2]); //300
	 System.out.println(a[3]); //400
	 System.out.println(a[4]); //500
	 
	 System.out.println(a[5]); //array out of bound error
	 
	}

}


//KeyPoint
//Array index always starts with 0
//If the mentioned index is more than the length of the array it will give array out of bound error