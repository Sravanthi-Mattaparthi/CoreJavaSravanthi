package com.dl.one;

public class Eg6 {
	
	//String to char array

	public static void main(String[] args) {
		
		String s1= new String("I like Java and I like programming");
		
		System.out.println(s1.lastIndexOf("like")); //18       //gives index of last like in the statement;
		
		System.out.println(s1.indexOf("like"));  //2           // gives index of first like in the statement;
		
		System.out.println(s1.indexOf("like",3)); //18         // gives  index of next like after the first like in statement

	}

}


//KeyPoint
// gives index of last like in the statement;
// gives index of first like in the statement;
//gives  index of next like after the first like in statement