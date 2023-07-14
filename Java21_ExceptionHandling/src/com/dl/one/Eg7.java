package com.dl.one;



public class Eg7 {

	
		//--Handling Exception--//
		
		public static void main(String[] args) {
			
			try {
				Class.forName("com.dl.one.Spring");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}

		}

	}

	class Spring{
		static {
			System.out.println("Spring class is second class in one package");
		}
	}

	class Servelts{
		static {
			System.out.println("Servelet is third classs in Eg7 of package one");
		}
	}

	//KeyPoint
	//in try block the class will be written with c as capital letter
	//consider the forName write the path of that class.
	//In JDBC class we declared the static method, as the main method is static it got executed automatically.
	//we can access the class which is in another package also.
