package com.dl.one;

class AA{
	
	public void m1(int a) {
		System.out.println("AA " + a);
	}
}

class BB extends AA{
	
	@Override
	public void m1(int a) {
		System.out.println("BB " + a);
	}
}

public class Eg3 {

	public static void main(String[] args) {
		
		AA bb = new BB();
		bb.m1(10);

	}

}
