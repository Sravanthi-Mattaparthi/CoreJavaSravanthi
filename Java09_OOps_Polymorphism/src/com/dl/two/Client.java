package com.dl.two;
//Method overriding

class RBI{
	public int getRateOfInterest() {
		return 0;
	}
}

class SBI extends RBI {
	public int getRateOfInterest() {
		return 2;
	}
}



class AXIS extends RBI {
	public int getRateOfInterest() {
		return 3;
	}
}


class ICICI extends RBI {
	public int getRateOfInterest() {
		return 3;
	}
}

public class Client {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println(sbi.getRateOfInterest());
		
		AXIS axis = new AXIS();
		System.out.println(axis.getRateOfInterest());
		
		ICICI icici = new ICICI();
		System.out.println(icici.getRateOfInterest());

	}

}
