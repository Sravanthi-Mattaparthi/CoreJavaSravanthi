package com.dl.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Eg11 {

	public static void main(String[] args) {
		
		// public boolean add(E e)
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		System.out.println(linkedList); //[null, null, null]
		
		// public boolean add(E e)
		ArrayList<String> list1 = new ArrayList<>();
		list1.add(null);
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		//  boolean add(E e);
		List<String> linkedList2 = new LinkedList<>();
		linkedList2.add(null);
		linkedList2.add(null);
		linkedList2.add(null);
		System.out.println(linkedList);
	}
}
