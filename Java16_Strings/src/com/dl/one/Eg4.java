package com.dl.one;

public class Eg4 {
	
	//String with "replace, replaceAll, replaceFirst"

	public static void main(String[] args) {
	
		String s1 = new String("Java for beginners");
		
		System.out.println(s1.replace("for", "4"));  //Java 4 beginners
		
		System.out.println(s1.replaceFirst("J","j"));  //java for beginners
		
		System.out.println(s1.replaceAll("a", "A"));  //jAvA 4 beginners
					

	}

}
//KeyPoint
//replace first replace only first character of the string
//replace all changes the values of all the characters that we ask to change in above 'a' changes to 'A'
//replace changes complete word in the string 