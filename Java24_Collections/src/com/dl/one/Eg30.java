package com.dl.one;

import java.util.HashMap;

public class Eg30 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "NameOne");
		hashMap.put(2, "NameTwo");
		hashMap.put(3, "NameThree");
		hashMap.put(4, "NameFour");
		hashMap.put(5, "NameFive");
		hashMap.put(6, "NameSix");
		hashMap.put(7, null);
		hashMap.put(8, null);
		System.out.println(hashMap); //{1=NameOne, 2=NameTwo, 3=NameThree, 4=NameFour, 5=NameFive, 6=NameSix, 7=null, 8=null}
		
		System.out.println(hashMap.size()); //8
		
		hashMap.remove(3);
		System.out.println(hashMap); //{1=NameOne, 2=NameTwo, 4=NameFour, 5=NameFive, 6=NameSix, 7=null, 8=null}
		
		hashMap.remove(2, "NameTwo");
		System.out.println(hashMap); //{1=NameOne, 4=NameFour, 5=NameFive, 6=NameSix, 7=null, 8=null}
		
		hashMap.clear();
		System.out.println(hashMap); //{}
	}

}
