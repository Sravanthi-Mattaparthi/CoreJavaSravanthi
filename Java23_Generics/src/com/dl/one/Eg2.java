package com.dl.one;

import java.util.ArrayList;
import java.util.List;

//Type Casting
public class Eg2 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add("10");
		l1.add("20");
		String s1 = (String)l1.get(0);
		System.out.println(s1.getClass());
		System.out.println(l1);
		l1.add(s1);
		System.out.println(l1);
		
		l1.add(100);
		Integer ii = (Integer)l1.get(3);
		System.out.println(ii.getClass());
		l1.add(ii);
		System.out.println(l1);
	}
}
