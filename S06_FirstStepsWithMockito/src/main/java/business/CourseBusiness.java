package business;

import java.util.ArrayList;
import java.util.List;

import service.CourseService;

// CourseBusiness = SUT - System under test or Method under test
public class CourseBusiness {

	// CourseService is a Dependecy
	private CourseService service;
	
	// Inject using constructor
	public CourseBusiness(CourseService service) {
		this.service = service;
	}
	
	public List<String> retrieveCoursesRelatedToSpring(String student) {
		
		var filteredCourses = new ArrayList<String>();
		if ("Foo Bar".equals(student)) return filteredCourses;
		
		var allCourses = service.retrieveCourse(student);
		
		for (String course: allCourses) {
			if (course.contains("Spring")) {
				filteredCourses.add(course);
			}
		}
		
		return filteredCourses;
	}
}