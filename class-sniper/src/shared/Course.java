package shared;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author noah, goldylocks
 *
 */
public class Course {
	
	private Department department;
	private int courseNumber;
	private Collection<Section> sections;

	public Course(Department department, int courseNumber, Collection<Section> sections) {
		this.department = department;
		this.courseNumber = courseNumber;
		this.sections = sections;
	}
	
	/**
	 * @return a read only list of the sections
	 */
	public Collection<Section> getSections() {
		Collection<Section> readOnly = Collections.unmodifiableCollection(sections);
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
}
