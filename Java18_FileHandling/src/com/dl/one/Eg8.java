package com.dl.one;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//BufferedReader with read()

public class Eg8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		int read = reader.read();
		System.out.println((char)read);
		reader.close();

	}

}

//KeyPoint
//Read method reads only first character of the string which is given as input
//Even if you give the input as number it reads only first digit of the number