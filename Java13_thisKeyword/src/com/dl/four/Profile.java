package com.dl.four;

public class Profile {
	
	//this is used to pass an arguments in the method
	
	public void add(Profile profile) {
		System.out.println("add method");
	}
	
	public void update() {
		add(this);
		delete();
		System.out.println("update method");
	}
	
	public void delete() {
		System.out.println("delete method");
	}

	
	public static void main(String[] args) {
		Profile profile= new Profile();
		profile.update();
	}

}

//KeyPoint
//Here for add method we passed the argument , so we wont call that method instead we call update so that add is called automatically
