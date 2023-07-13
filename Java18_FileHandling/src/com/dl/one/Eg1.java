package com.dl.one;

//File createNewFile()

import java.io.File;
import java.io.IOException;

public class Eg1 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("sravanthi.txt");  //creating a new file with name as sravanthi and file is txt format
		f1.createNewFile();
		System.out.println("Sravanthi file is created");
		System.out.println(f1.exists());
		
		
		//Approach two creating a new file in specified location by relative path
		
		File f2 = new File("src\\satya.txt");
		f2.createNewFile();
		System.out.println("Satya file is created");
		System.out.println(f2.exists());

		//Approach three creating a new file in specified location by absolute path path
		File f3 = new File("C:\\Users\\mouli\\OneDrive\\Desktop\\JavaPrograms\\Akhil.txt");
		f3.createNewFile();
		System.out.println("Akhil file is created");
		System.out.println(f3.exists());
	
		
		File f4 = new File("C:\\Users\\mouli\\OneDrive\\Desktop\\JavaPrograms\\javaex.txt");
		f4.createNewFile();
		System.out.println("JavaExample file is created");
		System.out.println(f4.exists());
		
		
		
		

	}
}

//KeyPoint
//starting writing with new File() then ctrl +1 assign to local variable
//next there will be red line indicating click on it select add throws.
//you will get throws IOException along with import java.io.IO.Exception added to program.
//Click on the Java project then refresh the folder, then whatever the new files created it will be reflected in project file.