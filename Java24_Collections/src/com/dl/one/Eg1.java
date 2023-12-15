package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg1 {

	public static void main(String[] args) {
		
		//add(index, element)
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 10);
		list.add(1, 20);
		list.add(2, 30);
		list.add(3, 40);
		list.add(4, 50);
		System.out.println(list); //[10, 20, 30, 40, 50]
		
		//list.add(6, 70);
		//System.out.println(list); //java.lang.IndexOutOfBoundsException: Index: 6, Size: 5
		
	}
}
