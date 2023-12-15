package com.dl.functionalinterface;

@FunctionalInterface
interface Login_Lambda {

	public abstract void login(String userName, String password);

}

public class Eg4 implements Login_Lambda {

	@Override
	public void login(String userName,  String password) {
		
		
	}
	
	//Functional Interface Using Lambda Functions
	public static void main(String[] args) {
		
		Login_Lambda login_Lambda = (uName, uPass) -> System.out.println("UserName is " + uName + " Password is " + uPass);
		login_Lambda.login("Sai Kiran", "Admin");
	}


}
