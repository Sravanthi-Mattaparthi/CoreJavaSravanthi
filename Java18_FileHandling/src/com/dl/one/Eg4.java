package com.dl.one;

import java.io.FileOutputStream;
import java.io.IOException;

//
public class Eg4 {

	public static void main(String[] args) throws IOException  {
		
	FileOutputStream fileOutputStream = new FileOutputStream("one.txt");
	String s1 = "Hello Java and Hello Python";
	byte[] bytes = s1.getBytes();
	fileOutputStream.write(bytes);
	System.out.println("New File created and data is inserted");
	fileOutputStream.close();
		
		
	}

}

//Theory
//A series of data is referred to as a stream. In Java, Stream is classified into two types,
//Byte Stream and Character Stream.
//Byte stream for write operation we have OutputStream class, read operation InputStream class


//KeyPoint
//start the code with writing new FileOutputStream then ctrl 1 assign to local variable,then ctrl 1 import statement
//Then place cursor after  FileOutputStream.write(bytes)it will pop-up with add throws, select IOExceptionn
