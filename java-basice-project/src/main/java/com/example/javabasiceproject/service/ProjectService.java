package com.example.javabasiceproject.service;

import com.example.javabasiceproject.entity.Project;

public interface ProjectService {
    Project saveProject(Project project);

    Project getProjectByCode(Long projectCode);
}
