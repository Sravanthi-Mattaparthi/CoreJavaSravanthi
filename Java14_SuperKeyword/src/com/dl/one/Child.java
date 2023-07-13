package com.dl.one;

public class Child extends Parent {
	
	int a = 500;
	int b=1000;

	public static void main(String[] args) {
		Child child =new Child();
		child.methods();
		
		
	}
	
	public void  methods() {
		System.out.println(this.a); //one way of approach  calling the child
		System.out.println(a);
		System.out.println(b);        //second way of approach  calling the child
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
		
	}

}


//In-order to call the parent class variables they should be taken in a method and we can implement super keyword in child class