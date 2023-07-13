package com.dl.one;

public class Eg3 {

	//String with "startsWith" , "endsWith" , "contains"
	public static void main(String[] args) {
		
		String s1 = new String("Java is complex");
		System.out.println(s1.startsWith("J"));  //true
		System.out.println(s1.startsWith("c"));   //false
		System.out.println(s1.startsWith("Java")); //true
		
		
		
		System.out.println(s1.endsWith("complex")); //true
		System.out.println(s1.endsWith("COMPLEX")); //false capital letters
		System.out.println(s1.endsWith("plex"));  //true
		
		
		String s2= new String ("Java is a high level language");
		System.out.println(s2.contains("is")); //true
		System.out.println(s2.contains("or")); //false
		
		

		

	}

}
