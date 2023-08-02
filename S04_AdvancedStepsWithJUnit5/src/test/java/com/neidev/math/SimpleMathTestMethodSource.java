package com.neidev.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Test math opesrations in SimpleMath class")
public class SimpleMathTestMethodSource {
	
	SimpleMath math;
	
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Running @BeforeEach method!");
		math = new SimpleMath();
	}
	
	@DisplayName("Test 10 / 2 = 5")
	@ParameterizedTest
	@MethodSource()
	void testDivision(double firstNumber, double secondNumber, double expected) {
		
		double result = math.division(firstNumber, secondNumber);
		
		assertEquals(expected, result, 2D, () -> firstNumber + " / " + secondNumber + " didnt produce: " + expected);
		assertNotNull(result);
		assertNotEquals(10, expected);
	}
	
	public static Stream<Arguments> testDivision() {
		return Stream.of(
				Arguments.of(6.2d, 2d, 3.1d),
				Arguments.of(71d, 14d, 5.07d),
				Arguments.of(18.3d, 3.1d, 5.90d)
		);
	}
	
	
}
