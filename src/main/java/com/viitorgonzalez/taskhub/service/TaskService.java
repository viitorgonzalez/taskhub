package com.viitorgonzalez.taskhub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viitorgonzalez.taskhub.model.Task;
import com.viitorgonzalez.taskhub.repository.TaskRepository;

/**
 *
 * @author Vítor Gonzalez
 */
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

}
