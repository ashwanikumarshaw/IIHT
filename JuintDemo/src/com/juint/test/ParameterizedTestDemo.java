package com.juint.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

//@ValueSource
//@EnumSource
//@MethodSource
//@CsvSource
//@CsvFileSource
//@ArgumentsSource

	// Value Source
	@ParameterizedTest
	@ValueSource(ints = { 1, 5, 3, 7 })
	public void valueSourceTest(int args) {
		System.out.println(args);
	}

	// EnumSource
	enum TV {
		LG, Samsung, Toshiba;
	}

	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV tv) {
		System.out.println(tv);
	}

	// MethodSource
	private static String[] cars() {
		return new String[] { "Audi", "Honda", "Swift" };
	}

	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTes(String args) {
		System.out.println(args);
	}
	
	// CsvSource

	@ParameterizedTest
	@CsvSource({ "Ashu", "Anu", "Nishant", "Anuran" })
	public void CsvSourceTest(String args) {
		System.out.println(args);
	}
}
