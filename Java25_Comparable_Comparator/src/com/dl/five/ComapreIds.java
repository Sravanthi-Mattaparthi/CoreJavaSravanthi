package com.dl.five;

import java.util.Comparator;

public class ComapreIds implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer i = o1.id;
		return i.compareTo(o2.id);
	}

}
