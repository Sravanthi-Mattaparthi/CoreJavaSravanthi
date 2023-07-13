package com.dl.one;

public class Eg8 {
	//Strings using join method

	public static void main(String[] args) {
	
		String join = String.join(" ", "Java","Python","JavaScript");
		System.out.println(join); //Java Python JavaSript
		
		
		String join2 = String.join(":","Java", "Python", "JavaSript");
		System.out.println(join2);

	}
	
	

}


//KeyPoint
//join is used to strings in-order how to display the output that we want.