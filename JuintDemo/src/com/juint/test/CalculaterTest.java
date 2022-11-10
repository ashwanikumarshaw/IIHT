package com.juint.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.juint.demo.Calculater;

class CalculaterTest {

	Calculater calc=new Calculater();
	@Test
	@DisplayName("Sum Test")
	public void testAddMethod() {
		int sum=calc.add(100, 10);
		System.out.println(sum);
		assertEquals(110, sum);
	}
	@Test
	public void testSubMethod() {
		int sub=calc.sub(100, 10);
		System.out.println(sub);
		assertEquals(90,sub);
	}
	@Test
	public void testProMethod() {
		int pro=calc.product(100, 50);
		System.out.println(pro);
		assertEquals(5000,pro);
	}
}
