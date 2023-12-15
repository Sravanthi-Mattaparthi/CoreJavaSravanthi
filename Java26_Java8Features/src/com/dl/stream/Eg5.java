package com.dl.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Eg5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		System.out.println(list);
		
		//Streams
		Stream<Integer> sorted = list.stream().sorted();
		sorted.forEach((n)->System.out.println(n));
		
		//Comparable and Comparator
		Collections.sort(list);
		System.out.println(list);
		
		//ArrayList
		list.sort(null);
		System.out.println(list);

	}

}
