package util;

import java.io.IOException;

import shared.Course;
import shared.Department;

/**
 * 
 * @author goldy
 *
 */
public interface CourseFetcher {
	
	/**
	 * @param department the department of the course
	 * @param courseNumber the course number
	 * @return the course fetched by the implementation
	 */
	Course fetchCourse(Department department, int courseNumber) throws IOException;

}
