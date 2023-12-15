package com.dl.one;

import java.util.LinkedHashMap;

public class Eg32 {

	public static void main(String[] args) {

		//Insertion Order, Duplicate Values allowed, Duplicate keys overrides the data
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(2, "NameTwo");
		map.put(1, "NameOne");
		map.put(5, "NameFive");
		map.put(3, "NameThree");
		map.put(6, "NameSix");
		map.put(4, "NameFour");
		map.put(1, "NameOneDuplicate");
		map.put(5, "NameFour");
		map.put(8, null);
		map.put(9, null);
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
	}

}
