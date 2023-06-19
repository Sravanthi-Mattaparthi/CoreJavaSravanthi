package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		//First way of approaching 
		
		 Eg1 eg1=new Eg1();
		 eg1.add();
		 eg1.delete();
		 
		 // Second way of approaching
		 
		 new Eg1().add();
		 new Eg1().delete();
		 
		// From line 8-15 there are two possibilities you can pick anyone , better the best approach is from line 8-10
		 	
	}
	//Instance Method1
	public void add() {
		System.out.println("Add method");
	}
	
	//Instance method 2
	public void delete() {
		System.out.println("Delete method");
	}

}


//Key point
//For accessing the instance method by the static main method we should surely create a object for it.
//That object will be helpful in accessing the Instance method into static main method.