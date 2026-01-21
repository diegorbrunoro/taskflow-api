package com.diego.taskflow.service;

import com.diego.taskflow.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> list() {
        return tasks;
    }

    public Task create(Task task) {
        task.setId((long) (tasks.size() + 1));
        tasks.add(task);
        return task;
    }
}
