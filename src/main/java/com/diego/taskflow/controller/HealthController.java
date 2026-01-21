package com.diego.taskflow.controller;

import com.diego.taskflow.model.Task;
import com.diego.taskflow.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HealthController {

    private final TaskService taskService;

    public HealthController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/tasks")
    public List<Task> listTasks() {
        return taskService.list();
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskService.create(task);
    }
}
