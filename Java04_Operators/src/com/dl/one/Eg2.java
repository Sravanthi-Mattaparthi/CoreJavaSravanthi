package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		//Assignment operators
		
		int a=10;
		int b= 20;
		System.out.println(a+=1);//11//a=a+1, a=10+1, a=11
		System.out.println(a+=b); //31
		
		System.out.println(a);//31
		
		System.out.println(a-=2); //29
		System.out.println(a-=b);//9
		
		System.out.println(a*=2);//18
	}

}
