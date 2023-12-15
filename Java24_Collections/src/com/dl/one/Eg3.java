package com.dl.one;

import java.util.ArrayList;

public class Eg3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list); //[10, 20, 30, 40, 50]
		System.out.println(list.size());
		
		list.add(2, 200);
		System.out.println(list); //[10, 20, 200, 30, 40, 50]
		System.out.println(list.size());

	}
}
