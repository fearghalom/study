/**
 * 
 */
package org.coislea.apps.mcp.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.coislea.apps.mcp.model.Address;
import org.coislea.apps.mcp.model.Instrument;
import org.coislea.apps.mcp.model.Student;
import org.junit.Before;
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
@Transactional
public class StudentServiceImplTest {

	@Inject
	private StudentService studentService;

	@Before
	public void setup() {
		Student student = new Student();
		student.setFirstName("Fearghal");
		student.setLastName("O Maolcatha");
		Address address = new Address();
		address.setTown("Cork");
		student.setAddress(address);
		student.setInstruments(Arrays.asList(Instrument.Banjo, Instrument.ButtonAccordeon));

		/* execute method under test */
		studentService.registerStudent(student);
		
		student = new Student();
		student.setFirstName("Joe");
		student.setLastName("Bloggs");
		address = new Address();
		address.setTown("Limerick");
		student.setAddress(address);
		student.setInstruments(Arrays.asList(Instrument.Fiddle, Instrument.Concertina));

		/* execute method under test */
		studentService.registerStudent(student);
	}
	
	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setFirstName("Fearghal");
		student.setLastName("O Maolcatha");
		Address address = new Address();
		address.setTown("Cork");
		student.setAddress(address);
		student.setInstruments(Arrays.asList(Instrument.Banjo, Instrument.ButtonAccordeon));

		/* execute method under test */
		studentService.registerStudent(student);

		List<Student> students = studentService.listStudents();
		assertThat(students).hasSize(3);
		assertThat(students.get(0).getFirstName()).isEqualTo("Fearghal");
		assertThat(students.get(0).getLastName()).isEqualTo("O Maolcatha");
		assertThat(students.get(0).getAddress()).isNotNull();
		assertThat(students.get(0).getAddress().getTown()).isEqualTo("Cork");
		assertThat(students.get(0).getInstruments()).hasSize(2).containsOnly(Instrument.Banjo,
				Instrument.ButtonAccordeon);
	}
	
	@Test
	public void testFindByLastName() {
		List<Student> students = studentService.listStudents();
		assertThat(students).hasSize(2);
		
		/* execute method under test */
		List<Student> results = studentService.findByLastName("O Maolcatha");
		
		assertThat(results).hasSize(1);
	}
}
