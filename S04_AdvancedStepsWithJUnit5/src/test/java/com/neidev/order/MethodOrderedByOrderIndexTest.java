package com.neidev.order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

//@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
class MethodOrderedByOrderIndexTest {

	StringBuilder sb = new StringBuilder("");
	
	@AfterEach
	void afterEach() {
		System.out.println("The actual value is " + sb);
	}
	
	@Test
	@Order(2) 
	void testA() {
		System.out.println("Running Test A");
		sb.append("2");
	}

	@Test
	@Order(1)
	void testC() {
		System.out.println("Running Test C");
		sb.append("1");
	}
	
	@Test
	@Order(3)
	void testD() {
		System.out.println("Running Test D");
		sb.append("3");
	}

	@Test
	@Order(4)
	void testB() {
		System.out.println("Running Test B");
		sb.append("4");
	}
	
}
