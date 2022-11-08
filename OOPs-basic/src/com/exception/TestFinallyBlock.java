package com.exception;

public class TestFinallyBlock {

	public static void main(String[] args) {
		try {
			Integer num = 100 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException  :  " + e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}finally {
			System.out.println("This bit is executed regardless of the exception occuring or not");
		}
		System.out.println("continue...");

	}

}
