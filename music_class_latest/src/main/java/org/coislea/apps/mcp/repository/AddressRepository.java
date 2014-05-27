/**
 * 
 */
package org.coislea.apps.mcp.repository;

import org.coislea.apps.mcp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fearghal
 * 
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
