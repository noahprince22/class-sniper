package shared.io;

import java.io.IOException;
import java.sql.Connection;

import shared.Course;

/**
 * @author Goldy
 */
public class DatabaseCourseWriter implements CourseWriter {
	
	private Connection sqlConnection;
	
	/**
	 * Constructs a new DatabaseCourseWriter
	 * @param sqlConnection the connection to the SQL server
	 */
	public DatabaseCourseWriter(Connection sqlConnection) {
		this.sqlConnection = sqlConnection;
	}

	@Override
	public void writeCourse(Course course) throws IOException {
		
	}

}
