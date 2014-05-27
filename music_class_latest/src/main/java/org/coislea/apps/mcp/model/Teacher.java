/**
 * 
 */
package org.coislea.apps.mcp.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * @author Fearghal
 *
 */
@Entity
@DiscriminatorValue(value="Musician")
public class Teacher extends Person {

	@OneToMany(mappedBy="teacher")
	private List<MusicClass> classesTaught;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6724925440566710382L;

}
