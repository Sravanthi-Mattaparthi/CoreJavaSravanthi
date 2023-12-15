package com.dl.one;

import java.util.ArrayList;

public class Eg1 {

	@Deprecated
	public void m1() {
		System.out.println("M1 Method");
	}

	@Deprecated
	public void m2() {
		System.out.println("M2 Method");
	}

	public void m3() {
		System.out.println("M3 Method");
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Eg1 eg1 = new Eg1();
		eg1.m1();
		eg1.m2();
		eg1.m3();

		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("One");

		Integer integer = new Integer(0);
		System.out.println(integer);

		Integer i;

	}
}
