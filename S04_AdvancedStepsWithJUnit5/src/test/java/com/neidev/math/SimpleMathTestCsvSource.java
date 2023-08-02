package com.neidev.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Test math opesrations in SimpleMath class")
public class SimpleMathTestCsvSource {
	
	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Running @BeforeEach method!");
		math = new SimpleMath();
	}
	
	@DisplayName("Test 10 / 2 = 5")
	@ParameterizedTest
	@CsvSource({
		"6.2, 2, 3.1",
		"71, 14, 5.07",
		"18.3, 3.1, 5.90"
	})
	void testDivision(double firstNumber, double secondNumber, double expected) {
		
		double result = math.division(firstNumber, secondNumber);
		
		assertEquals(expected, result, 2D, () -> firstNumber + " / " + secondNumber + " didnt produce: " + expected);
		assertNotNull(result);
		assertNotEquals(10, expected);
	}
	

}
