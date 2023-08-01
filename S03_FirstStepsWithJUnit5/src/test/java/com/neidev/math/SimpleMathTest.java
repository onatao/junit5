package com.neidev.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test math opesrations in SimpleMath class")
public class SimpleMathTest {
	
	SimpleMath math;
	
	@BeforeAll
	static void beforeAllMethod() {
		System.out.println("Running @BeforeAll method!");
	}
	
	@AfterAll
	static void afterAllMethod() {
		System.out.println("Running @AfterAll method!");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Running @BeforeEach method!");
		math = new SimpleMath();
	}
	
	@AfterEach
	void afterEachMethod() {
		System.out.println("Running @AfterEach method!");
	}
	
	@Test
	@DisplayName("Test 10 / 2 = 5")
	void testDivision() {
		// Given - Arrange
		double firstNumber = 10;
		double secondNumber = 2;
		double expected = 5;
		// When - Act
		double result = math.division(firstNumber, secondNumber);
		// Then - Assert
		assertEquals(expected, result, () -> firstNumber + " / " + secondNumber + " didnt produce: " + expected);
		assertNotNull(result);
		assertNotEquals(10, expected);
	}
	
	@Test
	@DisplayName("Test 10 * 2 = 20")
	void testMultiplication() {
		double firstNumber = 10;
		double secondNumber = 2;
		
		Double result = math.multiplication(firstNumber, secondNumber);
		double expected = 20;
		
		assertEquals(expected, result, () -> firstNumber + " * " + secondNumber + " didnt produce: " + expected);
		assertNotNull(result);
		assertNotEquals(10, result);
	}
	
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
	void testSum() {
		double firstNumber = 6.2;
		double secondNumber = 2;
		Double result = math.sum(firstNumber, secondNumber);
		
		double expected = 8.2d;
		Double actual = result;
		
		assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " didnt produced: " + expected);
		assertNotEquals(9.2, actual);
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test 10 - 2 = 8.0")
	void testSubtraction() {
		double firstNumber = 10;
		double secondNumber = 2;

		double expected = 8d;
		double actual = math.subtraction(firstNumber, secondNumber);
		
		assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " didnt produce: " + expected);
		assertNotEquals( 10, actual);
		assertNotNull(actual);
	}
	
	@Test
	@DisplayName("Test (10 + 2)/2 = 6")
	void testMean() {
		double firstNumber = 10;
		double secondNumber = 2;
		
		double expected = 6;
		double result = math.mean(firstNumber, secondNumber);
		
		assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " /2 didnt produce: " + expected);
		assertNotNull(result);
		assertNotEquals(8, result);
	}
	
	@Test
	@DisplayName("Test 2*2 = 4")
	void testSquareRoot() {
		double number = 4;
		
		double result = math.squareRoot(number);
		double expected = 2;
		
		assertEquals(expected, result, () -> number + "squared didnt produce: " + expected);
		assertNotEquals(5, result);
		assertNotNull(result);
	}
	
	@Test
	@Disabled("TODO: Still working on it")
	@DisplayName("Test division by zero")
	void testDivisionByZero() {
		
	}
}
