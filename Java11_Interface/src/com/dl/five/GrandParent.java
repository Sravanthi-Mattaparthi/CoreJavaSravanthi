package com.dl.five;
//In some case we don't want to implement all the abstract methods in interface, then
//we can implement the expected method in next abstract class and remaining methods in normal class


public interface GrandParent {

	
	void m1();
	
	void m2();
	
	void m3();
	
	void m4();
	
}


//KeyPoint
//We will implement the m1, m2 methods in parent class
//Next m3 and m4 in the child class
// Later we will take client class having main method there will execute all the methods in main class