package com.dl.one;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Eg31 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "NameOne");
		hashMap.put(2, "NameTwo");
		hashMap.put(3, "NameThree");
		hashMap.put(4, "NameFour");
		hashMap.put(5, "NameFive");
		hashMap.put(6, "NameSix");
		
		System.out.println(hashMap.keySet()); // [1, 2, 3, 4, 5, 6]
		
		System.out.println(hashMap.values()); // [NameOne, NameTwo, NameThree, NameFour, NameFive, NameSix]
		
		Set<Integer> keySet = hashMap.keySet();
		System.out.println(keySet);
		
		Collection<String> values = hashMap.values();
		System.out.println(values);
	}

}
