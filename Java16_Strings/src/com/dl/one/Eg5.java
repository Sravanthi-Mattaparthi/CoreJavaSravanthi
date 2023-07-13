package com.dl.one;

public class Eg5 {

	// charArray[] , charAt
	public static void main(String[] args) {
		String s1 = new String("Hi Java,Are you easy to learn?");
		char[] charArray = s1.toCharArray();
		charArray[3]= 'j';
	    System.out.println(charArray);
	    
	    
	    String s2 = new String("Programming");
	    System.out.println(s2.charAt(0));
	    System.out.println(s2.charAt(20)); 
	   // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 20
		
		
		
		
		
	}
		

	}

//KeyPoint 
//if we want to modify the string in middle then first we convert the string to array
//type s1.you will get drop-down select the toCharArray then ctrl1 it will assign to local variable
//charAt is used to get the value of character using the index position , it will return the character value
//If we mention the index position above the characters indexes then it will show out of bound error
