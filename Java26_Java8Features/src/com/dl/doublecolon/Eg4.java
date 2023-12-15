package com.dl.doublecolon;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Eg4 {

	public static void main(String[] args) {

		//Syntax: Interface i = Class::new
		Student student = StudentImpl::new;
		System.out.println(student.getStudent(1, "Sai Kiran"));
		
		BiFunction<Integer, String, StudentImpl >f1 = StudentImpl::new;
		StudentImpl impl = f1.apply(2, "Sai Ram");
		System.out.println(impl); //StudentImpl [id=2, name=Sai Ram]
		
		Function<String, Integer> f = (s) -> s.length();
		Integer apply = f.apply("Java");
		System.out.println(apply);
	}

}
