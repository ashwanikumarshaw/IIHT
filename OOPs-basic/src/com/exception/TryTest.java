package com.exception;

public class TryTest {
	public static void main(String[] args) {
		try {
			Integer num = 100 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException  :  " + e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
		System.out.println("continue...");
	}
}
