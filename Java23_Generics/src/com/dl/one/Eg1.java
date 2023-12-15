package com.dl.one;

import java.util.ArrayList;
import java.util.List;

//Type Safety
public class Eg1 {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add("NameOne");
		l1.add("NameTwo");
		l1.add(20.50);
		System.out.println(l1);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		//list1.add("NameOne"); //The method add(Integer) in the type List<Integer> is not applicable for the arguments (String)
		
		
	}
}
