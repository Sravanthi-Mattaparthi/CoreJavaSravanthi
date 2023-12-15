package com.dl.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Eg20 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		System.out.println(list); // [NameOne, NameTwo, NameThree, NameFour]

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
