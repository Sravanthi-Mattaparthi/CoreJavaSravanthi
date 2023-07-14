package com.dl.one;

//throw keyword allows us to throw checked or unchecked exception
public class Eg10 {

	public static void main(String[] args) {
	getloginDetails("Admin");

	}
	
	public static void getloginDetails(String name) {
		if(name!="Admin") {
			try {
				throw new Exception("Execution failed due to name mismatch");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("Name entered is matched:" +name);
		}
		
	}

}
//KeyPoint
//throw will be declared along with new keyword and followed by Exception
//if throw is declared either in try or catch block there is no need to write the syso statement.


//About throw
//Definition: Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
//Syntax: The throw keyword is followed by an instance of Exception to be thrown
//throw is used within the method.
//We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
