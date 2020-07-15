package org.timeSheet.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.timeSheet.entities.Task;
import org.timeSheet.entities.User;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
}
