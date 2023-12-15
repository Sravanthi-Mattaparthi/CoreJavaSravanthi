package com.dl.one;

import java.util.Stack;

public class Eg16 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.add("NameOne");
		stack.add("NameTwo");
		stack.add("NameThree");
		stack.add("NameFour");
		System.out.println(stack); //[NameOne, NameTwo, NameThree, NameFour]
		
		stack.add(0, "NameZero");
		System.out.println(stack); //[NameZero, NameOne, NameTwo, NameThree, NameFour]
		
		stack.add(5, "NameFive");
		System.out.println(stack); //[NameZero, NameOne, NameTwo, NameThree, NameFour, NameFive]
		
		
	}
}
