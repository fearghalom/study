/**
 * 
 */
package org.coislea.apps.mcp.service;

import java.util.List;

import javax.inject.Inject;

import org.coislea.apps.mcp.model.MusicClass;
import org.coislea.apps.mcp.repository.MusicClassRepository;
import org.springframework.stereotype.Service;

/**
 * @author Fearghal
 *
 */
@Service
public class MusicClassServiceImpl implements MusicClassService {

	@Inject
	private MusicClassRepository musicClassRepository;
	
	@Override
	public void save(MusicClass musicClass) {
		musicClassRepository.save(musicClass);
	}

	@Override
	public void deleteStudent(Long musicClassId) {
		musicClassRepository.delete(musicClassId);
	}

	@Override
	public List<MusicClass> listMusicClasses() {
		return musicClassRepository.findAll(); 
	}

}
