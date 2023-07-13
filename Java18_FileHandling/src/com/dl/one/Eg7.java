package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferReader  with readLine()
public class Eg7 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter any number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		int parseInt = Integer.parseInt(readLine);
		System.out.println(parseInt);
		reader.close();
		
		


}
}

//KeyPoint
//new BufferReader ctrl space bar  , null chnage to new Input ctrl space bar-> system ctrl space bar click on in
//ctrl 1 assign to new local variable
//similarly reader.readLine() then ctrl 1
//Add throws IOException
//readLine always takes String

