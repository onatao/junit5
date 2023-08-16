package business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CourseService;

public class CourseBusinessMockTest {

	CourseService mockService;
	CourseBusiness business;
	List<String> courses;
	
	@BeforeEach
	void setUp() {
		mockService = mock(CourseService.class);
		business = new CourseBusiness(mockService);
		
		courses = Arrays.asList(
				"REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
                "Agile Desmistificado com Scrum, XP, Kanban e Trello",
                "Spotify Engineering Culture Desmistificado",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker",
                "Docker do Zero à Maestria - Contêinerização Desmistificada",
                "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
                "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
                "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#",
                "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
                "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
                "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
               );
	}
	
	@Test
	void testCoursesRelatedToSpringWhenUsingMock() {
		when(mockService.retrieveCourse("Nathan")).thenReturn(courses);
		
		var filteredCourses = business.retrieveCoursesRelatedToSpring("Nathan");
		
		assertEquals(4, filteredCourses.size());
	}
}
