package com.dl.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Eg1 {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);
		System.out.println(s.count()); // 5
		
		Stream<String> name = Stream.of("Mani", "Hari", "Mahesh", "Vikas");
		Optional<String> findFirst = name.filter(i -> i.startsWith("Ma")).findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}else {
			System.out.println("No Name Found");
		}
	}
}
