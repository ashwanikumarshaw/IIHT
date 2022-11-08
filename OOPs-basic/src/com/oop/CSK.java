package com.oop;

public class CSK extends IPL {//Abstraction using abstract
	// abstract method must be inherited
	@Override
	void play() {
		System.out.println("Play ....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSK csk = new CSK();
		csk.play();
	}

}
