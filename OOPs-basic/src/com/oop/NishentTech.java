package com.oop;

public class NishentTech implements ITCompanies{//Abstraction using interface
	//implement all un-implemented method from interface 
	@Override
	public void Working() {
		System.out.println("Nishant Tech is working ");
	}

	public static void main(String[] args) {
		NishentTech nt=new NishentTech();
		nt.Working();
	}


}
