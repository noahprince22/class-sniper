/**
 * 
 */
package parser;

import shared.Course;
import shared.Department;

/**
 * @author Queen Poah, Michael "Goldilocks" Goldstein, and Bitchell Wortman
 *
 */
public abstract class CatalogParser {

	/**
	 * 
	 * @param dept the department of the course
	 * @param number the course number
	 * @return a Course object with the parsed course data
	 */
	abstract Course parseCourse(Department dept, int number);
	
}
