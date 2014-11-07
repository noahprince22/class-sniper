/**
 * 
 */
package shared;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author noah
 *
 */
public class Section {
	
	private String crn; // Using a String because not all universities will use an integer identifier. 
	private SectionTime time;
	private SectionType type;
	private String professor;
	private String location;
	private Collection<Section> linkedSections;
	
	public Section(String crn, SectionTime time, SectionType type, String professor, String location, Collection<Section> linkedSections) {
		this(crn,time,type,professor,location);
		this.linkedSections = new ArrayList<Section>(linkedSections);
	}
	
	public Section(String crn, SectionTime time, SectionType type, String professor, String location) {
		this.crn = crn;
		this.time = time;
		this.type = type;
		this.professor = professor;
		this.location = location;
	}
	
	public void addLinkedSection(Section section) {
		if(!linkedSections.contains(section))
			linkedSections.add(section);
	}
	
	/**
	 * @return a read only list of sections
	 */
	public Collection<Section> getLinkedSections() {
		return linkedSections;
	}
	
	/**
	 * @return the CRN
	 */
	public String getCrn() {
		return crn;
	}
	
	/**
	 * @return the time
	 */
	public SectionTime getTime() {
		return time;
	}

	/**
	 * @return the type
	 */
	public SectionType getType() {
		return type;
	}

	/**
	 * @return the professor
	 */
	public String getProfessor() {
		return professor;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
}
