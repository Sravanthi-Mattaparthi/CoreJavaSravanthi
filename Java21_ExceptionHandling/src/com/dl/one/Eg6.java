package com.dl.one;

//ClassNotFound Exception
public class Eg6 {

	public static void main(String[] args) {	
		
		//....Exception not handled.....
		
	//Class.forName("com.dl.one.JDBC");	 //ClassNotFoundException
		
	}

}
class JDBC{
	static {
	System.out.println("JDBC is a second class in one package");
		

	}
}

//KeyPoint
//remove the comments for line 10 to know the exception . I will commit the line because the class is getting error