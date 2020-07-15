package org.timeSheet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.timeSheet.entities.Role;

public interface RoleRepository  extends JpaRepository<Role, String>{
 
}
