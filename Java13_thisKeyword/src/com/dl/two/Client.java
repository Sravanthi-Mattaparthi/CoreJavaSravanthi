package com.dl.two;

public class Client {

	//this keyword to invoke current class method
	
	public void add() {
		this.update();
		System.out.println("Add method");
		
	}
	
	public void update() {
		this.delete();
		System.out.println("update method");
	}
	public void delete() {
		System.out.println("delete method");
	}
	public static void main(String[] args) {
		Client client= new Client();
		client.add();

	}

}

//keyPoint
// here we created object to class we called add(), which in turn calls rest of the methods as they are linked together
