package com.dl.two;
//method overriding 
class Eg1 {
	
	public void  gasStation(int pPrice, int dPrice) {
		System.out.println("Petrol Price 1: " +pPrice);
		System.out.println("Diesel Price 1: " +dPrice);
	}
	
	
}

 public class Eg2 extends Eg1{
	 
	 public void  gasStation(int pPrice, int dPrice) {
			System.out.println("Petrol Price 2: " +pPrice);
			System.out.println("Diesel Price 2: " +dPrice);
		}
	 
	 public static void main (String []args) {
		 Eg1 eg1 = new Eg1();
		 eg1.gasStation(110, 70);
		 
		 Eg2 eg2 = new Eg2();
		 eg2.gasStation(120, 80);
		 	 
	 }	
	 
}
//Key point 
 //Method overriding requires multiple classes, same method names and same arguments.
