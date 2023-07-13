package com.dl.one;

import java.io.File;

//mkdir() , The mkdir() method is used for creating a new directory.

public class Eg2 {

	public static void main(String[] args) {
		
		File f1 = new File("Season");
		boolean mkdir = f1.mkdir();
		System.out.println(mkdir);
		f1.mkdir();
		System.out.println(f1.mkdir());
		
		File f2 = new File("CoreJava\\JavaPrograms\\winter");
		boolean mkdirs = f2.mkdirs();
		System.out.println(mkdirs);
		

	}

}
//KeyPoint
//For creating single directory use mkdir
//For creating multiple directories use mkdirs
//Inside directories don't create file of any type