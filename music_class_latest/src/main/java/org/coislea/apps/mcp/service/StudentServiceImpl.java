/**
 * 
 */
package org.coislea.apps.mcp.service;

import java.util.List;

import javax.inject.Inject;

import org.coislea.apps.mcp.model.Student;
import org.coislea.apps.mcp.repository.AddressRepository;
import org.coislea.apps.mcp.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Fearghal
 * 
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Inject
	private StudentRepository studentRepository;

	@Override
	public void registerStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(long studentId) {
		studentRepository.delete(studentId);
	}

	@Override
	public List<Student> listStudents() {
		return studentRepository.findAll();
	}
}
