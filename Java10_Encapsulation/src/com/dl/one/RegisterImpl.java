package com.dl.one;

public class RegisterImpl extends Register {

	public static void main(String[] args) {
		RegisterImpl impl =new RegisterImpl();
		impl.setUserName("Satya");
		impl.setUserEmail("satya@gmail.com");
		impl.setUserContact(9876543210l);
		impl.setUserSalary(98000.00);
		
		
		System.out.println(impl.getUserName());
		System.out.println(impl.getUserEmail());
		System.out.println(impl.getUserContact());
		System.out.println(impl.getUserSalary());	

	}

}
