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
public class Section {
	/**
	 * @return a read only list of sections
	 */
	public List<Section> getLinkedSections() {
		List<Section> readOnly = Collections.unmodifiableList(linked);	
		return readOnly;
	}
	
	/**
	 * @return the CRN
	 */
	public String getCRN() {
		return CRN;
	}
	
	/**
	 * @return the time
	 */
	public CourseTime getTime() {
		return time;
	}

	/**
	 * @return the type
	 */
	public CourseType getType() {
		return type;
	}

	/**
	 * @return the prof
	 */
	public String getProf() {
		return prof;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	private String CRN; // Using a String because not all universities will use an integer identifier. 
	private CourseTime time;
	private CourseType type;
	private String prof;
	private String location;
	private List<Section> linked;
}
