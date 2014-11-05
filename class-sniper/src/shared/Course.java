/**
 * 
 */
package shared;

import java.util.Collections;
import java.util.List;

/**
 * @author noah
 *
 */
public class Course{
	/**
	 * @return a read only list of the sections
	 */
	public List<Section> getSections() {
		List<Section> readOnly = Collections.unmodifiableList(sections);	
		return readOnly;
	}

	/**
	 * @return the department (ex ECE)
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @return the course number
	 */
	public int getCourseNumber() {
		return courseNumber;
	}
	
	private Department department;
	private int courseNumber;
	private List<Section> sections;
}
