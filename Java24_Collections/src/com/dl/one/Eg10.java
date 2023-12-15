package com.dl.one;

import java.util.LinkedList;
import java.util.List;

public class Eg10 {

	public static void main(String[] args) {
		
	    //add, get, remove
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(0, 10);
		linkedList.add(1, 20);
		linkedList.add(2, 30);
		linkedList.add(3, 40);
		linkedList.add(4, 50);
		linkedList.add(5, 60);
		linkedList.add(6, 70);
		linkedList.add(7, 80);
		System.out.println(linkedList); //[10, 20, 30, 40, 50, 60, 70, 80]
		
		System.out.println(linkedList.get(4)); //50
		System.out.println(linkedList.get(6)); //70
		
		System.out.println(linkedList.remove(5)); //60
		
		System.out.println(linkedList); //[10, 20, 30, 40, 50, 70, 80]

	}

}
