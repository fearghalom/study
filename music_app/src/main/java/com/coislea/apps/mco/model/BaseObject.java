/**
 * 
 */
package com.coislea.apps.mco.model;

import javax.persistence.Id;

/**
 * @author Fearghal
 * 
 */
public class BaseObject {
	@Id
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

}
