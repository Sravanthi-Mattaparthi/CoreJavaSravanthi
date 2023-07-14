package com.dl.two;

//ClassNotFound accessing class JDBC in package one of Eg7 to Eg1 of package one
public class Eg1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.dl.one.Servelts");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	

	}

}
