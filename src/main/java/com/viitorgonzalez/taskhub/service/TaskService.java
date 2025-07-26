package com.viitorgonzalez.taskhub.service;

import java.util.List;
import java.util.Optional;

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

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        Optional<Task> task = this.taskRepository.findById(id);
        return task.orElseThrow(() -> new RuntimeException(
            "Task not found! Id: " + id
        ));
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public Task update(Task task) {
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

}
