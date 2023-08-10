package com.neidev;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.Person;
import service.IPersonService;
import service.PersonService;

public class PersonServiceTest {

	Person person;
	IPersonService service;
	
	@BeforeEach
	void setUp() {
		service = new PersonService();
		
		person = new Person(
				"Nathan", 
				"Barros", 
				"email@gmail.com", 
				"Brasil - SP", 
				"Male" 
		);
	} 

	@Test
	@DisplayName("Should Return a Person Object")
	void shouldReturnAPersonObject() {
		Person actual = service.createPerson(person);
		
		assertNotNull(actual, () -> "The createPerson() shouldnt have returned null");
	}

	@Test
	@DisplayName("Should assert all Person data")
	void shouldAssertAllPersonData() {
		Person actual = service.createPerson(person);

		assertNotNull(person.getId(), () -> "Id cannot be null value");
		assertEquals(person.getName(), actual.getName());
		assertEquals(person.getSecondName(), actual.getSecondName());
		assertEquals(person.getEmail(), actual.getEmail());
		assertEquals(person.getAddres(), actual.getAddres());
		assertEquals(person.getGender(), actual.getGender());
	}
	
	@Test
	@DisplayName("Should throw expection when email is null")
	void shouldThrowExceptionWhenEmailIsNull() {
		person.setEmail(null);
		
		assertThrows(
				IllegalArgumentException.class,
				() -> service.createPerson(person), 
				() -> "Email field cannot be null"
			);
	}
	
	@Test
	@DisplayName("Should assert exception message for null e-mail")
	void shoudlAssertExceptionMessageForNullEmail() {
		person.setEmail(null);
		Exception message = assertThrows(IllegalArgumentException.class,
				() -> service.createPerson(person),
				() -> "Email field cannot  be null");
		
		Exception actual = new IllegalArgumentException("Person e-mail is null or empty");
		/*
		 *  If we use .toString() method on Exception we assert Exception type and message, 
		 *  otherwise .getMessage() compares only the Exception message
		 */
		assertEquals(message.toString(), actual.toString());
	}
}
