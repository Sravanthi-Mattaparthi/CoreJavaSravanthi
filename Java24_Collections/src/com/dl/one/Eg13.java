package com.dl.one;

import java.util.LinkedList;

public class Eg13 {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(0, 10);
		linkedList.add(1, 20);
		linkedList.add(2, 30);
		linkedList.add(3, 40);
		linkedList.add(4, 50);
		linkedList.add(5, 60);
		linkedList.add(6, 70);
		linkedList.add(7, 80);
		System.out.println(linkedList); //[10, 20, 30, 40, 50, 60, 70, 80]
		
		linkedList.addFirst(100);
		System.out.println(linkedList); //[100, 10, 20, 30, 40, 50, 60, 70, 80]
		
		linkedList.addLast(800);
		System.out.println(linkedList); //[100, 10, 20, 30, 40, 50, 60, 70, 80, 800]
				
		linkedList.addFirst(1000);
		System.out.println(linkedList); //[1000, 100, 10, 20, 30, 40, 50, 60, 70, 80, 800]
		
		System.out.println(linkedList.getFirst()); //1000
		
		System.out.println(linkedList.getLast()); //800
		
		System.out.println(linkedList.get(4)); //30
		
		linkedList.removeFirst();
		System.out.println(linkedList); //[100, 10, 20, 30, 40, 50, 60, 70, 80, 800]
		
		linkedList.removeLast();
		System.out.println(linkedList);  //[100, 10, 20, 30, 40, 50, 60, 70, 80]
		
	}

}
