package com.dl.one;

public class Eg7 {
	//split method

	public static void main(String[] args) {
		
		String s1 = ("Java Python JavaSript ");
		String[] split = s1.split(" ");
			for (String string : split) {
				System.out.println(string);
				
				
			}
			System.out.println("");
			
	     String s2 = ("Java:Python:JavaSript");
		 String[] split2 = s2.split(":");
		for (String string : split2) {
		       System.out.println(string);
		       
					
				}
		
		System.out.println("");
		String s3 = ("JavaandPythonandJavaSript");
		 String[] split3 = s3.split("and");
		for (String string : split3) {
		       System.out.println(string);
		     
					
				}
			
		System.out.println("");
		String s4 = ("Java Python JavaSript c c++");
		 String[] split4 = s4.split(" ",3);
		for (String string : split4) {
		       System.out.println(string);
					
				}		
					
		}
		
	}

//KeyPoint
//In order to get for each block , type for then ctrl spacebar, you will get an option called for each select it.
//To assign it to local variable the ctrl 1 , then enter . it will assign to variable.
//for line 36 and 35 , see after every string we have spaces  in line 35
//to declare line 36 whatever you declared either spaces or incase (':')mention them next pass value , the previous strings will be executed
//if ex(" ",3) then for line 35 we have o/p as Java  python in new lines and rest in same line ( JavaSript c c++)
