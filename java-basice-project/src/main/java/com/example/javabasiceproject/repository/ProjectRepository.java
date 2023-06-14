package com.example.javabasiceproject.repository;

import com.example.javabasiceproject.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    Project findByProjectCode(Long assignedProject);
}
