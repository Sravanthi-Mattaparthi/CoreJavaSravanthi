package com.dl.one;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg6 {
	// InputStream class used for byte stream data for read operation

	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream("one.txt");
		int j;
		while ((j=stream.read())!=-1)
			System.out.print((char)j);
		  stream.close();
		

	}

}
