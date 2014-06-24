/**
 * This code is copyright (c) 2014 EMC Corporation
 */
package org.coislea.apps.mcp.service;

import java.util.List;

import org.coislea.apps.mcp.model.Teacher;

/**
 * @author omaolf
 * @version $Id$
 */
public interface TeacherService {
	void registerTeacher(Teacher teacher);

	void deleteTeacher(long teacherId);

	List<Teacher> listTeachers();
}
