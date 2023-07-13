package com.dl.one;

import java.io.FileWriter;
import java.io.IOException;

//write operation
public class Eg3 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("C:\\Users\\mouli\\OneDrive\\Desktop\\execercise\\write.txt");
		writer.write("Java is simple and easy to learn if you put some effort");
		writer.close();
		System.out.println("Written statement is done");

	}

}


//KeyPoint
//Create a folder in your local system 
//THere you can copy the path 
//Then using write statement , whatever you want to write into the file you can do that
//After  writing close the writer then only the statement whatever you return it will be there in the write.txt


//Theory
//A series of data is referred to as a stream. In Java, Stream is classified into two types,
// Byte Stream and Character Stream.
//Character stream for write operation we have Writer class, read operation Reader class


