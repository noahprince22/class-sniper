package shared.io;

import java.io.IOException;

import shared.Course;

/**
 * @author Goldy
 */
public interface CourseWriter {
	
	/**
	 * @param course the course to write
	 */
	public void writeCourse(Course course) throws IOException;

}
