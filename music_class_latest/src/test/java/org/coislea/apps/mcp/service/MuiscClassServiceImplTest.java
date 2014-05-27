/**
 * 
 */
package org.coislea.apps.mcp.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.coislea.apps.mcp.model.MusicClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Tests {@code MusicClassServiceImpl}
 * 
 * @author Fearghal
 *
 */
@ContextConfiguration("classpath:contexts/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback=true)
@Transactional
public class MuiscClassServiceImplTest {
	
	@Inject
	private MusicClassService musicClassService;
	
	@BeforeTransaction
	public void beforeTransaction() {
		System.out.println("Before the transaction");
	}
	
	@Test
	public void testCreateMusicClass() {
		/* setup test data */
		MusicClass musicClass = new MusicClass();
		
		/* invoke method under test */
		musicClassService.save(musicClass);
		
		/* verify results */
		List<MusicClass> musicClasses = musicClassService.listMusicClasses();
		assertThat(musicClasses).hasSize(1);
		
	}
	
	@Test
	public void testCreateMusicClassWithTeacher() {
		/* setup test data */
		MusicClass musicClass = new MusicClass();
		
		/* invoke method under test */
		musicClassService.save(musicClass);
		
		/* verify results */
		List<MusicClass> musicClasses = musicClassService.listMusicClasses();
		assertThat(musicClasses).hasSize(1);
	}
}
