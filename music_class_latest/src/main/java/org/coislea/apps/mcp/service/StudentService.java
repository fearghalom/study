/**
 * 
 */
package org.coislea.apps.mcp.service;

import java.util.List;

import org.coislea.apps.mcp.model.Student;

/**
 * @author Fearghal
 * 
 */
public interface StudentService {
	void registerStudent(Student student);

	void deleteStudent(long studentId);

	public List<Student> listStudents();
}
