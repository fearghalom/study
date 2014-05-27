/**
 * 
 */
package org.coislea.apps.mcp.repository;

import org.coislea.apps.mcp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fearghal
 *
 */
public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
