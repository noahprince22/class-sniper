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

	abstract Course parseCourse(Department dept, int number);
	
}
