package com.dl.four;

// If a class implements more than one interface , then interfaces are separated by comma
//example child implements GrandParent, Parent

public interface GrandParent {
	public abstract void m1();
	void m2();
	

}

//KeyPoint 
//As multiple inheritance is not supported by the java , we implement them by using interface 
//The example shown here is the child class extracts both the properties of GrandParent as well as Parent
//Go through the example done here.
