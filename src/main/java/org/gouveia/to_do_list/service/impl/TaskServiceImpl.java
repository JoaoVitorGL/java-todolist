package org.gouveia.to_do_list.service.impl;

import org.gouveia.to_do_list.domain.model.Task;
import org.gouveia.to_do_list.domain.repository.TaskRepository;
import org.gouveia.to_do_list.exception.TaskNotFoundException;
import org.gouveia.to_do_list.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new TaskNotFoundException("Task with ID " + id + " not found"));
    }

    @Override
    public Task create(Task taskToCreate) {
        return taskRepository.save(taskToCreate);
    }

    @Override
    public Task update(Long id, Task task) {
        Task taskToUpdate = taskRepository.findById(id).orElseThrow(TaskNotFoundException::new);
            taskToUpdate.setTitle(task.getTitle());
            taskToUpdate.setDescription(task.getDescription());
            taskToUpdate.setCompleted(task.isCompleted());
            return taskRepository.save(taskToUpdate);
    }

    @Override
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
