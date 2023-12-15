package com.dl.one;

import java.util.Vector;

public class Eg14 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("NameOne");
		vector.add("NameTwo");
		vector.add("NameThree");
		vector.add("NameFour");
		System.out.println(vector); //[NameOne, NameTwo, NameThree, NameFour]
		
		Vector<String> vector2 = new Vector<>(vector);
		vector2.add("NameFive");
		vector2.add("NameSix");
		vector2.add("NameSeven");
		vector2.add("NameEight");
		System.out.println(vector2); //[NameOne, NameTwo, NameThree, NameFour, NameFive, NameSix, NameSeven, NameEight]
		
		
	}
}
