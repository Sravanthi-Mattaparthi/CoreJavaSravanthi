package com.dl.one;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Eg26 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(65);
		set.add(67);
		set.add(66);
		set.add(68);
		set.add(70);
		set.add(68);
		set.add(85);
		System.out.println(set); //[65, 66, 67, 68, 70, 85]
		
		System.out.println(set.descendingSet()); //[85, 70, 68, 67, 66, 65]
		
		//Greater than or equal to
		System.out.println(set.ceiling(69)); //70
		
		//Greater than
		System.out.println(set.higher(70));
		
		//Greater than, less than or equal to
		System.out.println(set.floor(86));
		
		//Less than
		System.out.println(set.lower(69));
		
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
	}

}
