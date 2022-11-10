package com.juint.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.juint.demo.Calculater;

class CalculaterTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("afterAll");
	}
	Calculater calc;
	@BeforeEach
	public void init() {
		calc=new Calculater();
		System.out.println("beforeEach");
	}
	@AfterEach
	public void afterEach() {System.out.println("afterEach");}
	
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
/*
 * O/P:
beforeAll
beforeEach
5000
afterEach
beforeEach
90
afterEach
beforeEach
110
afterEach
afterAll
*/