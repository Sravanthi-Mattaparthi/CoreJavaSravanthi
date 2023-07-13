package com.dl.one;

public class Eg2 {

	//String using compareTo, compareToIgnoreCase 
	
	public static void main(String[] args) {
	String s1 = new String("A");
	String s2 = new String("B");
	String s3 = new String("A");
	
	System.out.println(s1.compareTo(s2));  // s1<s2  , 65<66 , 65-66 = -1
	
	System.out.println(s1.compareTo(s3));  //s1==s2  , 65==65, 65-65 = 0
	
	System.out.println(s2.compareTo(s3));  //s2>s3  ,   66>65 , 66-65 = 1
	
	String s4 = new String("C");
	String s5 = new String("c");
	String s6 = new String("d");
	
    System.out.println(s4.compareToIgnoreCase(s5));  //0  67==67, 67-67 or 99-99 here we are ignoring the upper/ lower case treating everything same
    
	System.out.println(s5.compareToIgnoreCase(s6));  //  99-100 = -1 
	
	System.out.println(s4.compareToIgnoreCase(s6)); // 67-68  =-1
	

	}

}


//KeyPoint 
//The compareTo will work on "unicode format"
//67 is "C" , 97 is for  "c" , 100 is for "d"
