/**
 * 
 */
package org.coislea.apps.mcp.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.coislea.apps.mcp.model.Address;
import org.coislea.apps.mcp.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Fearghal
 *
 */
@ContextConfiguration("classpath:contexts/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceTest {

	@Inject
	private StudentService studentService;
	
	@Test
	public void testSaveStudent() {
		Student student = new Student() ;
		student.setFirstName("Fearghal");
		student.setLastName("O Maolcatha");
		Address address = new Address();
		address.setTown("Cork");
		student.setAddress(address);

		/* execute method under test */
		studentService.registerStudent(student);
		
		 
		List<Student> students = studentService.listStudents();
		assertThat(students).hasSize(1);
		assertThat(students.get(0).getFirstName()).isEqualTo("Fearghal");
		assertThat(students.get(0).getLastName()).isEqualTo("O Maolcatha");
		assertThat(students.get(0).getAddress()).isNotNull();
		assertThat(students.get(0).getAddress().getTown()).isEqualTo("Cork");
	}
}
