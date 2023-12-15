package com.dl.one;

import java.util.Vector;

public class Eg15 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<>();
		vector.addElement("NameOne");
		vector.addElement("NameTwo");
		vector.addElement("NameThree");
		vector.addElement("NameFour");
		System.out.println(vector);
		
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
	}
}
