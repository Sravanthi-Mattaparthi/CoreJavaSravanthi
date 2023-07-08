package com.dl.one;
// this keyword refers to the current class instance variables
public class Profile {
	
	//instance variable
		public String  userName;
		public String  userEmail;
		public long  userContact;
		public double  userSalary;
		public String  userAddress;
		
		
		//Parameterized constructor
	public Profile(String userName, String userEmail, long userContact, double userSalary, String userAddress) {
		
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userSalary = userSalary;
		this.userAddress = userAddress;
	}
	public void display() {
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userContact);
		System.out.println(userSalary);
		System.out.println(userAddress);
		
	}

	public static void main(String[] args) {
	 Profile p=new Profile("Sravanthi", "sravanthi@gmail.com", 9876543210l, 95000.00, "Delhi");
	 p.display();

	}
}
