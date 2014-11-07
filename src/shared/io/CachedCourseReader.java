package shared.io;

import java.sql.Connection;

import org.joda.time.Period;

import shared.Course;
import shared.Department;
import util.CourseFetcher;

/**
 * @author Goldy
 */
public class CachedCourseReader implements CourseReader {
	
	private CourseFetcher courseFetcher;
	private Connection sqlConnection;
	private Period period;

	/**
	 * Constructs a new CachedCourseReader with the default period of 5 minutes
	 * @param courseFetcher the CourseFetcher used to refresh the stale cache
	 * @param sqlConnection the SQL connection to the database that serves as the cache
	 */
	public CachedCourseReader(CourseFetcher courseFetcher, Connection sqlConnection) {
		this(courseFetcher, sqlConnection, new Period(0, 5, 0, 0));
	}
	
	/**
	 *  Constructs a new CachedCourseReader
	 * @param courseFetcher the CourseFetcher used to refresh the stale cache
	 * @param sqlConnection the SQL connection to the database that serves as the cache
	 * @param period the time period after which the cache is considered stale
	 */
	public CachedCourseReader(CourseFetcher courseFetcher, Connection sqlConnection, Period period) {
		this.courseFetcher = courseFetcher;
		this.sqlConnection = sqlConnection;
		this.period = period;
	}

	@Override
	public Course readCourse(Department department, int courseNumber) {
		// TODO:
		// Read from database
		// if data is stale
		//    call courseFetcher.fetchCourse(department, courseNumber)
		//    update database with new data
		//    return the course
		// else return the data from the database
		return null;
	}
	
	private Course readCourseFromDatabase(Connection sqlConnection) {
		return null;
	}

}
