package com.dl.five;

public abstract class Parent implements GrandParent {

	@Override
	public void m1() {
	System.out.println("M1 is the method GrandParent implemented in Parent");

	}

	@Override
	public void m2() {
		System.out.println("M2 is the method GrandParent implemented in Parent");

	}



	}


//KeyPoint
// while implementing only 2 methods out of four , it shows error , keep abstract in the class
//we can overcome this error