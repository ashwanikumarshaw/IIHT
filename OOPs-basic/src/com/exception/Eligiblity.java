package com.exception;

public class Eligiblity {
	public static void Eligible(Integer exp) {
		if (exp<3)
			throw new ArithmeticException("the persion is not Eligible" );
		else
			System.out.println("the persion is Eligible");
	}
	public static void main(String[] args) {
		try{Eligible(2);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
