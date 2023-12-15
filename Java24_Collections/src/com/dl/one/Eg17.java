package com.dl.one;

import java.util.Stack;

public class Eg17 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack); //[1, 2, 3, 4]
		
		stack.pop();
		System.out.println(stack); //[1, 2, 3]
		
		stack.pop();
		System.out.println(stack); //[1, 2]
		
		stack.pop();
		System.out.println(stack); //1]
		
		stack.pop();
		System.out.println(stack); //[]
		
		stack.pop();
		System.out.println(stack); //java.util.EmptyStackException
		

	}

}
