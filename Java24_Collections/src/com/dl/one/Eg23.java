package com.dl.one;

import java.util.HashSet;

public class Eg23 {

	public static void main(String[] args) {
		
		//Unordered, No Duplicates, Null Allowed only once
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("NameOne");
		hashSet.add("NameTwo");
		hashSet.add("NameThree");
		hashSet.add("NameFour");
		hashSet.add("NameFive");
		hashSet.add("NameSix");
		hashSet.add("NameOne");
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet); //[NameOne, null, NameFive, NameFour, NameTwo, NameSix, NameThree]

	}

}
