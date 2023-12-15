package com.dl.one;

import java.util.ArrayList;

public class Eg8 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add(0, "A");
		list1.add(1, "B");
		list1.add(2, "C");
		list1.add(3, "D");
		list1.add(4, "B");
		list1.add(5, "E");
		list1.add(6, "B");
		list1.add(7, "F");
		System.out.println(list1);
		
		System.out.println(list1.indexOf("B")); //1
		
		System.out.println(list1.lastIndexOf("B")); // 6
		
		System.out.println(list1.size()-4);
		

	}

}
