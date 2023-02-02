package com.afroze.projectmanagement.project.api.repository;

import com.afroze.projectmanagement.project.api.domain.Project;
import com.afroze.projectmanagement.project.api.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByProject(Project project);
}
