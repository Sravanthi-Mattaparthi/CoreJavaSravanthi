package com.dl.doublecolon;

import java.util.ArrayList;
import java.util.List;

public class Eg1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("NameOne");
		names.add("NameTwo");
		names.add("NameThree");
		names.add("NameFour");
		names.add("NameFive");
		System.out.println(names); // [NameOne, NameTwo, NameThree, NameFour, NameFive]
		
		//Syntax: ClassName.property::sttaicMethodName
		names.forEach(System.out::println);
	}

}
