package com.dl.one;

import java.util.Enumeration;
import java.util.Vector;

public class Eg19 {

	public static void main(String[] args) {

		// Types of cursors
		// Enumeration (legacy : vector and stack) //Not a Universal Cursor
		// Iterator
		// ListIterator

		Vector<String> vector = new Vector<>();
		vector.add("NameOne");
		vector.add("NameTwo");
		vector.add("NameThree");
		vector.add("NameFour");
		System.out.println(vector);

		Enumeration<String> elements = vector.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

	}
}
