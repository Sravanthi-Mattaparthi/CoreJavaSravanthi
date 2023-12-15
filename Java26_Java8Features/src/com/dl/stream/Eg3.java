package com.dl.stream;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Eg3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);
		System.out.println(list);
		
		Stream<Integer> stream = list.stream();
		
		Optional<Integer> min = stream.min(Integer::compare);
		if(min.isPresent()) {
			System.out.println("Minium Value: " + min.get());
		}
		stream = list.stream();
		Optional<Integer> max = stream.max(Integer::compare);
		if(max.isPresent()) {
			System.out.println("Max Value: " + max.get());
		}

	}

}
