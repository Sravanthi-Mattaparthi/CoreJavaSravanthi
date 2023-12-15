package com.dl.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eg2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Pradeep");
		list.add("Praneeth");
		list.add("Mahesh");
		list.add("Vikas");
		System.out.println(list);
		
		List<String> collect = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> collect2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);
	}

}
