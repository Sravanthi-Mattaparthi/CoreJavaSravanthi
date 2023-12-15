package com.dl.one;

import java.util.ArrayList;

public class Eg27 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		int i1;
		list1.add("A");
		i1 = list1.get(0).compareTo("A");
		System.out.println(i1); //0
		
		ArrayList<String> list2 = new ArrayList<>();
		int i2;
		list2.add("B");
		i2 = list2.get(0).compareTo("A");
		System.out.println(i2); //1
		
		ArrayList<String> list3 = new ArrayList<>();
		int i3;
		list3.add("A");
		i3 = list3.get(0).compareTo("B");
		System.out.println(i3); //-1

	}

}
