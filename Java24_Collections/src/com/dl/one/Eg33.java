package com.dl.one;

import java.util.TreeMap;

public class Eg33 {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(3, "NameThree");
		hm.put(2, "NameTwo");
		hm.put(1, "NameOne");
		hm.put(3, "NameThreeDuplicate");
		hm.put(4, "NameFour");
		hm.put(5, "NameFive");
		hm.put(6, null);
		hm.put(5, null);
		hm.put(null, null);
		System.out.println(hm);
	}

}
