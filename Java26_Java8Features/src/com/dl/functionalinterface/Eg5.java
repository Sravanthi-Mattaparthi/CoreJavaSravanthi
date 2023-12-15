package com.dl.functionalinterface;

@FunctionalInterface
interface Login_User{

	public abstract void login();
	
}

public class Eg5 {
	
	String userName;
	String password;
	
	public Eg5(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void sendRequest() {
		
		Login_User login_User = ()->{
			System.out.println(userName);
			System.out.println(password);
		};
		login_User.login();
	}

	public static void main(String[] args) {
		
		new Eg5("Sai Kiran", "Admin").sendRequest();;
	}
}
