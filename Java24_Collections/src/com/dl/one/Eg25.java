package com.dl.one;

import java.util.TreeSet;

public class Eg25 {

	public static void main(String[] args) {
		
		//Natural Sorting Order, No Duplicates, 
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("E");
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("F");
		treeSet.add("G");
		treeSet.add("A");
		//treeSet.add(null); //java.lang.NullPointerException
		System.out.println(treeSet); // [A, B, C, D, E, F, G]
		
		//String s1 = null;
		//System.out.println(s1.length());
	}
}
