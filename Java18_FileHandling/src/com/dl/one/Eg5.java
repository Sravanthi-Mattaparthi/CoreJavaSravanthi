package com.dl.one;


import java.io.FileReader;
import java.io.IOException;


// reader class for character data

public class Eg5 {

	public static void main(String[] args) throws IOException {
	
		FileReader reader = new FileReader("one.txt");
		int i;
		while ((i=reader.read()) !=-1) 
			System.out.print((char)i);
		reader.close();
}
} 


//KeyPoint
//In order to read the data which is of character type , the data need to be pulled character by character
//Most probably we use while loop