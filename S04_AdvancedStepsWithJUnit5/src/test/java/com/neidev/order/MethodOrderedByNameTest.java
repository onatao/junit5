package com.neidev.order;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MethodOrderedByNameTest {

	@Test
	@Order(0)
	void testA() {
		System.out.println("Running Test A");
	}

	@Test
	@Order(2)
	void testC() {
		System.out.println("Running Test C");
	}
	
	@Test
	@Order(3)
	void testD() {
		System.out.println("Running Test D");
	}

	@Test
	@Order(4)
	void testB() {
		System.out.println("Running Test B");
	}
	
}
