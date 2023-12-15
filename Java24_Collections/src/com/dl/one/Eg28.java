package com.dl.one;

import java.util.ArrayList;
import java.util.Collections;

public class Eg28 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("B");
		list.add("D");
		list.add("A");
		list.add("C");
		
		//Insertion Order
		System.out.println(list);
		
		//Sorting Order
		list.sort(null);
		System.out.println(list); //[A, B, C, D]
		
		//Reverse Order
		Collections.reverse(list);
		System.out.println(list); //[D, C, B, A]
		
	}
}
