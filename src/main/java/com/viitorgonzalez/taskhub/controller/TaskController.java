package com.viitorgonzalez.taskhub.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viitorgonzalez.taskhub.model.Task;
import com.viitorgonzalez.taskhub.service.TaskService;

/**
 *
 * @author Vítor Gonzalez
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    // injeção de dependência
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskService.save(task);
    }

}
