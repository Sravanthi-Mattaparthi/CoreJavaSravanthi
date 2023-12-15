package com.dl.one;

import java.util.HashMap;

public class Eg29 {

	public static void main(String[] args) {
		
		//Sorting Order, Duplicate key Not Allowed, Duplicate Values Allowed
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(103, "NameThree");
		hashMap.put(102, "NameTwo");
		hashMap.put(101, "NameOne");
		hashMap.put(101, "NameOne");
		hashMap.put(104, "NameFopur");
		hashMap.put(105, "NameFive");
		hashMap.put(106, "NameSix");
		hashMap.put(107, "NameSix");
		System.out.println(hashMap);
	}

}
