package com.dl.one;

public class Eg8 {
// single try block with different types of exception and multiple catch blocks

	public static void main(String[] args) {
		
		try {
			int x =10;
			int y=20;
			int z= 0;
			System.out.println(x/y);
 		    System.out.println(y/z); //java.lang.ArithmeticException
 		    
 		    
 		  
 			int b[]= {10,20,30,40,50};
 			//index =  0 1   2  3  4
 			System.out.println(b[0]);
 			System.out.println(b[1]);
 			System.out.println(b[5]);  // java.lang.ArrayIndexOutOfBoundsException:
 			
 			String s1=null;
		    System.out.println(s1.length()); //java.lang.NullPointerException
			
			
			String s11 ="Ten";
			int parseInt = Integer.parseInt(s11);
			System.out.println(parseInt); // java.lang.NumberFormatException
 		    
			String s111 = "Hello Java you are easy to learn";
			System.out.println(s111.charAt(6));
			System.out.println(s111.charAt(50));//java.lang.StringIndexOutOfBoundsException
 		
		}
		catch (ArithmeticException e) {
			   System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		 {
		       System.out.println(e);
		
	    }
		
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		catch(NumberFormatException e){
			System.out.println(e);
			
		}
		catch(StringIndexOutOfBoundsException e) {
			 System.out.println(e);
			 
		 }	
	}

}
//KeyPoint
//This scenario is used when for very exception in try block if we want to display the particular exception then we will use this scenario
//Uncomment the line and you can check the exception after exception