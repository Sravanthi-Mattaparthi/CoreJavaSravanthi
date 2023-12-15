package com.dl.one;

import java.util.Hashtable;

public class Eg34 {

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("one", 1);
		ht.put("two",2);
		ht.put("three", 3);
		ht.put("four", 4);
		System.out.println(ht); // {two=2, one=1, three=3, four=4}
		
		Hashtable<Integer, String> ht2 = new Hashtable<>();
		ht2.put(1, "one");
		ht2.put(2, "two");
		ht2.put(3, "three");
		ht2.put(4, "four");
		System.out.println(ht2);  // {4=four, 3=three, 2=two, 1=one}
		
	}

}
