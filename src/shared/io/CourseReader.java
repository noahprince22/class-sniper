package shared.io;

import shared.Course;
import shared.Department;

public interface CourseReader {
	
	Course readCourse(Department department, int courseNumber);
	
}
