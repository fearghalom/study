/**
 * 
 */
package org.coislea.apps.mcp.repository;

import org.coislea.apps.mcp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fearghal
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
}
