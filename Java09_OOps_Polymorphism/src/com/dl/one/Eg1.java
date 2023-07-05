package com.dl.one;

//Method Overloading

public class Eg1 {
	public void  gasStation(int pPrice, int dPrice) {
		System.out.println("Petrol Price 1: " +pPrice);
		System.out.println("Diesel Price 1: " +dPrice);
	}
	
	public void gasStation(float pPrice, float dPrice) {
		System.out.println("Petrol Price 2: " +pPrice);
		System.out.println("Diesel Price 2: " +dPrice);	
	}

	
	public static void main(String[] args) {
		Eg1 eg1 =new Eg1();
		eg1.gasStation(100, 80);
		eg1.gasStation(100.12f, 80.5f);

	}

}
//Keypoint

// one class , Method names must be same, arguments will be different
//Example calss = Eg1; methods= gasstation , arguments =( int in one method and float in another method), 