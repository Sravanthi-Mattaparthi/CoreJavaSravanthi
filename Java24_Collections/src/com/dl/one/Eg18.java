package com.dl.one;

import java.util.Stack;

public class Eg18 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.add("A");
		stack.add("B");
		stack.add("C");
		stack.add("D");
		stack.add("E");
		System.out.println(stack); //[A, B, C, D, E]

		System.out.println(stack.search("A")); //5
		System.out.println(stack.search("E")); //1
		System.out.println(stack.search("F")); //-1
		
		System.out.println(stack.peek()); //E
		System.out.println(stack.peek()); //E
		System.out.println(stack.peek()); //E
		
		System.out.println(stack.empty());
		stack.clear();
		System.out.println(stack.empty());
	}
}
