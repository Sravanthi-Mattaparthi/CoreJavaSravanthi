package com.dl.one;

//infinite for loop in try block , catch block
public class Eg16 {

	public static void main(String[] args) {
		try {
			for(;;) {
				System.out.println("Try block - infinte for loop");
			}
		}
		catch(Exception e) {
			System.out.println(e);

	}

}
}

//KeyPoint
//even there is infinite loop in try with combination of catch or finally , the catch and finally blocks are not executed