package org.gouveia.to_do_list.service;

import org.gouveia.to_do_list.domain.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> listAll();
    Task findById(Long id);
    Task create(Task taskToCreate);
    Task update(Long id, Task task);
    void delete(Long id);
}
