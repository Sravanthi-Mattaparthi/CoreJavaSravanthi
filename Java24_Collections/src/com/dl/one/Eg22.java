package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Eg22 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		System.out.println(list);

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println(" ");
		
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}
