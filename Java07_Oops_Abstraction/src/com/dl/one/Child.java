package com.dl.one;

public class Child extends Parent {

	@Override
	public void m1() {
		
			System.out.println("This is abstract method");

		}

		public static void main(String[] args) {
			Parent parent =new Child();
			parent.m1();
			parent.m2();

		}

	}


