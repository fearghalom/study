/**
 * 
 */
package com.coislea.apps.mco.model;

import java.util.Date;

/**
 * @author Fearghal
 * 
 */
public class MusicClass extends BaseObject {
	private MusicTeacher musicTeacher;
	private Date startTime;
	private Date endTime;

	/**
	 * @return the musicTeacher
	 */
	public MusicTeacher getMusicTeacher() {
		return musicTeacher;
	}

	/**
	 * @param musicTeacher
	 *            the musicTeacher to set
	 */
	public void setMusicTeacher(MusicTeacher musicTeacher) {
		this.musicTeacher = musicTeacher;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime
	 *            the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * @param endTime
	 *            the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

}
