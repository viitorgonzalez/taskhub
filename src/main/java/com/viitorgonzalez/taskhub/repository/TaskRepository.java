package com.viitorgonzalez.taskhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viitorgonzalez.taskhub.model.Task;

/**
 *
 * @author Vítor Gonzalez
 */
public interface TaskRepository extends JpaRepository<Task, Long> {

}
