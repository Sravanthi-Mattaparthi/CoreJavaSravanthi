package com.dl.one;

public class Eg4<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {

		Eg4<Integer> eg4 = new Eg4<Integer>();
		eg4.setObj(10);
		
		Eg4<Integer> eg5 = new Eg4<Integer>();
		eg5.setObj(20);
		// eg4.setObj("50"); //The method setObj(Integer) in the type Eg4<Integer> is
		// not applicable for the arguments (String)

		System.out.println(eg4.getObj());
		System.out.println(eg5.getObj());

	}

}
