package com.dl.one;

import java.util.LinkedHashSet;

public class Eg24 {

	public static void main(String[] args) {
		
		//Insertion Order / Ordered Elements, No Duplicates, Null allowed once 
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("NameOne");
		set.add("NameTwo");
		set.add("NameThree");
		set.add("NameFour");
		set.add("NameFive");
		set.add("NameSix");
		set.add("NameOne");
		set.add(null);
		set.add(null);
		System.out.println(set); //[NameOne, NameTwo, NameThree, NameFour, NameFive, NameSix, null]

	}
}
