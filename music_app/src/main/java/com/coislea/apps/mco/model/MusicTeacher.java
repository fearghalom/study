/**
 * 
 */
package com.coislea.apps.mco.model;

import java.util.List;

/**
 * @author Fearghal
 * 
 */
public class MusicTeacher extends Person {
	private List<MusicClass> musicClassesTaught;

	/**
	 * @return the musicClassesTaught
	 */
	public List<MusicClass> getMusicClassesTaught() {
		return musicClassesTaught;
	}

	/**
	 * @param musicClassesTaught
	 *            the musicClassesTaught to set
	 */
	public void setMusicClassesTaught(List<MusicClass> musicClassesTaught) {
		this.musicClassesTaught = musicClassesTaught;
	}

}
