package com.dl.one;

public class Eg10 {

	//StringBuffer , StringBuilder
	
	public static void main(String[] args) {
		
		//StringBuffer
		StringBuffer sb1 = new StringBuffer("Java");
		sb1.append("Python");
		System.out.println(sb1);
		
		
		//StringBuilder
		
		StringBuilder sb2 = new StringBuilder("JavaScript");
		sb2.append("C-sharp");
		System.out.println(sb2);
		

	}

}
//KeyPoint
//Strings are immutable.
//String buffer is mutable, provides thread safety , version is 1.0 , thread safety can be known using synchronized keyword
//String builder is also mutable , no thread safety , version is 1.5