package com.dl.one;

import java.util.ArrayList;
import java.util.List;

//Generic Method
public class Eg3 {

	public static <E> void printElements(E[] elements) {

		for (E e : elements) {
			System.out.println(e);
		}
	}

	public static <E> void printList(List<Integer> list) {

		for (Integer e : list) {
			System.out.println(e);
		}
	}

	public static <E> void main(String[] args) {

		Integer a[] = {10, 20, 30, 40, 50};
		printElements(a);
		
		List l1 = new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add("5");
		printList(l1);
	}
}
