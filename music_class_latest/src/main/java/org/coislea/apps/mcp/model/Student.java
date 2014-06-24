/**
 * 
 */
package org.coislea.apps.mcp.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author Fearghal
 *
 */
@Entity
@DiscriminatorValue("Student")
public class Student extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1372202527668453546L;

	@ManyToMany
	@JoinTable(name = "STUDENT_MUSICCLASS", joinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "MUSICCLASS_ID", referencedColumnName = "id"))
	private List<MusicClass> classes;

	@ElementCollection(targetClass = Instrument.class)
	@Enumerated
	private List<Instrument> instruments;

	public List<MusicClass> getClasses() {
		return classes;
	}

	public void setClasses(List<MusicClass> classes) {
		this.classes = classes;
	}

	public List<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(List<Instrument> instruments) {
		this.instruments = instruments;
	}

}
