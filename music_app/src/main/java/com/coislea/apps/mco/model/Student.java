/**
 * 
 */
package com.coislea.apps.mco.model;

import java.util.List;

/**
 * @author Fearghal
 * 
 */
public class Student extends Person {

	private List<MusicClass> musicClassesTaken;

	/**
	 * @return the musicClassesTaken
	 */
	public List<MusicClass> getMusicClassesTaken() {
		return musicClassesTaken;
	}

	/**
	 * @param musicClassesTaken
	 *            the musicClassesTaken to set
	 */
	public void setMusicClassesTaken(List<MusicClass> musicClassesTaken) {
		this.musicClassesTaken = musicClassesTaken;
	}

}
