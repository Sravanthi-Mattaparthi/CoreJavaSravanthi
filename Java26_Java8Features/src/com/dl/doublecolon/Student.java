package com.dl.doublecolon;

@FunctionalInterface
public interface Student {

	StudentImpl getStudent(int id, String name);
	
}
