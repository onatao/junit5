package service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import business.CourseBusiness;
import service.stubs.CourseServiceStub;

class CourseBusinessTest {

	@Test
	void testCoursesRelatedToSpringWhenUsingAStub() {
		CourseService stubService = new CourseServiceStub();
		CourseBusiness business = new CourseBusiness(stubService);
		
		var filteredCourses = business.retrieveCoursesRelatedToSpring("Nathan");
		
		assertEquals(4, filteredCourses.size());
	}
	
}
