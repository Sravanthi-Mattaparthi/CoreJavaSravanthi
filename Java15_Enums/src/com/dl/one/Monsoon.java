package com.dl.one;

public class Monsoon {

	public static void main(String[] args) {
		System.out.println(Seasons.SUMMER);
		System.out.println(Seasons.AUTUMN);
		System.out.println(Seasons.RAINY);
		System.out.println(Seasons.WINTER);
		
		
		
		//In order to check whether a constant is there or not in enum we use valueOf method
		
		Seasons valueOf =Seasons.valueOf("SUMMER");
		System.out.println(valueOf);

	}

}
