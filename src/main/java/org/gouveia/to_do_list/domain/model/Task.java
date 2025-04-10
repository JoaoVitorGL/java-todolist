package org.gouveia.to_do_list.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long id;

    @Column(name = "task_title")
    @NotBlank(message = "The task title cannot be blank")
    private String title;

    @Column(name = "task_description")
    @NotBlank(message = "The task description cannot be blank")
    private String description;

    @Column(name = "task_done")
    private boolean completed;
}
