package com.neidev.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test math opesrations in SimpleMath class")
public class SimpleMathTestParameterizedSourceAndValueSource {
	
	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Nathan", "Arthur"})
	void testValueSource(String firstName) {
		System.out.println(firstName);
		assertNotNull(firstName);
	}
	
	@DisplayName("Test 10 / 2 = 5")
	@ParameterizedTest
	/*
	 *  Getting parameters from resources/textDivision.csv 
	 */
	@CsvFileSource(resources = "/testDivision.csv")
	void testDivision(double firstNumber, double secondNumber, double expected) {
		
		double result = math.division(firstNumber, secondNumber);
		
		assertEquals(expected, result, 2D, () -> firstNumber + " / " + secondNumber + " didnt produce: " + expected);
		assertNotNull(result);
		assertNotEquals(10, expected);
	}
	

}
