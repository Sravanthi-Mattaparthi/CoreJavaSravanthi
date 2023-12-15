package com.dl.one;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Eg21 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		System.out.println(list);

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("NameTwo")) {
				iterator.remove();
			}
		}
		
		System.out.println(list);

	}

}
