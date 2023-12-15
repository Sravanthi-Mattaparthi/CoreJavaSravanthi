package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add(0, "NameZero");
		list.add(1, "NameOne");
		list.add(2, "NameTwo");
		list.add(3, "NameThree");
		list.add(4, "NameFour");
		list.add(5, "NameFive");
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(2, "NameTwoDuplicate");
		System.out.println(list);
		System.out.println(list.size());

	}

}
