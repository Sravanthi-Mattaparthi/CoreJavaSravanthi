package com.dl.one;

//example for throw along with throws
public class Eg17 {
	
      public void getName(String name) throws Exception  {
		
		if(name == "Admin") {
			System.out.println("User Name is: " + name);
		}else {
			throw new Exception("User Name is Incorrect");
		}
	}

	public static void main(String[] args)throws Exception {

		Eg17 eg17 = new Eg17();
		eg17.getName("Admin");
		


	}

}


