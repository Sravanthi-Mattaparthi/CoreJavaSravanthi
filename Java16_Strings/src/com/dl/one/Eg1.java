package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		// strings are immutable, they cannot be changed
		//we can create strings using two different ways 1.literals 2.new keyword 
		
		String s1= "Java";
		System.out.println(s1);      //1Object SCP
		
		String s2= new String("Java");
		System.out.println(s2);			//2 Object (SCP,Heap area)
		
		
		String s3= "Java";
		System.out.println(s3);      
		
		String s4= new String("Java");
		System.out.println(s4);		
		

		String s5= new String("Python");
		System.out.println(s5);		
		
		
		
		//== (ref) and .equals() (content)
		System.out.println(s1 == s3);//true
		System.out.println(s1 == s2);//false
		System.out.println(s2 == s4); //false //extra copy in scp and heap area
		
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1.equals(s5));  //false
		

	}

}

//Keypoint
//== is a reference comparison, i.e. both objects point to the same memory location
//.equals() evaluates to the comparison of values in the objects