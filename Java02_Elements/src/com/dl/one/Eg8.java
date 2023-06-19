package com.dl.one;

public class Eg8 {
//Bank example for static / Instance (with variables and methods)
	public static void main(String[] args) {
		new Eg8().customerDetails(123, "sravanthi", "sravanthi@gmail.com", 9955664433l);
		bankDetails("ICICI Bank", "Vizag");
		new Eg8().customerDetails(456, "satya", "satya@gmail.com", 8877665544l);
		bankDetails("ICICI Bank", "Vizag");
		new Eg8().customerDetails(789, "akhil", "akhil@gmail.com", 7755331100l);
		bankDetails("ICICI Bank", "Vizag");
		
	}
	
	public void customerDetails(int cId, String customerName,  String customerEmail, long customerContactNo) { //Instance method
		System.out.println("Customer Id : " + cId);
		System.out.println("Customer Name : " +customerName);
		System.out.println("Customer EmailId: " + customerEmail);
		System.out.println("Customer Contact number: " + customerContactNo);
		
		
		
	}
	
	public static void bankDetails(String bankName, String bankAddress) {
		System.out.println("Bank Name:" + bankName);
		System.out.println("Bank Address: " + bankAddress);
		System.out.println("");
	}

}
