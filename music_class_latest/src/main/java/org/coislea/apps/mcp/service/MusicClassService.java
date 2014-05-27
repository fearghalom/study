/**
 * 
 */
package org.coislea.apps.mcp.service;

import java.util.List;

import org.coislea.apps.mcp.model.MusicClass;

/**
 * @author Fearghal
 *
 */
public interface MusicClassService {
	void save(MusicClass musicClass);

	void deleteStudent(Long musicClassId);

	public List<MusicClass> listMusicClasses();
}
