package com.dl.one;

//Finally will not be  executed if there is a System.exit statement in try block
public class Eg14 {

	public static void main(String[] args) {
	 try {
		 System.out.println("Try block executed");
		 System.exit(0);
	 }
	 finally {
		 System.out.println("Finally block executed");
	 }

	}

}

//KeyPoint
//if there is System.exit in try block the finally block will not be executed, 
//here the functionality of the finally block is stopped because of system.exit
