package com.dl.six;

//protected modifier with variable as example
public class Eg1{
	
	protected String userName="Akhil"; //protected variable
	
	public static void main(String[] args) {
		
	System.out.println(new Eg1().userName);
	}
	
}


//KeyPoint
//Protected can be accessed within same package of different class.
//In this example we try to access the protected variable from Eg1 to Eg2 within same package
//Next we create Eg3 in other package and test whether that Eg3 in other package is able to access the Eg1 in another package
