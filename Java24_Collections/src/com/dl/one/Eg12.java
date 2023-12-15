package com.dl.one;

import java.util.ArrayList;
import java.util.LinkedList;

public class Eg12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("A");
		arrayList.add("C");
		System.out.println(arrayList);
		arrayList.sort(null);
		System.out.println(arrayList);
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("B");
		linkedList.add("D");
		linkedList.add("A");
		linkedList.add("C");
		System.out.println(linkedList);
		linkedList.sort(null);
		System.out.println(linkedList);
		
	}
}
