package com.dl.one;

//Encapsulation :Binding the data together

public class Register {
	
	private String userName;
	private String userEmail;
	private long userContact;
	private double userSalary;
	
	
	//Generated setters and getters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	public double getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}
	
}


//KeyPoint
//To generate setters and getters simply place the mouse pointer on the code editor 
//right click-->source-->generate setters and getters