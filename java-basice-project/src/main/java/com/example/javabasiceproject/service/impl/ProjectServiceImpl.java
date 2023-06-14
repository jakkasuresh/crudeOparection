package com.example.javabasiceproject.service.impl;

import com.example.javabasiceproject.entity.Project;
import com.example.javabasiceproject.repository.ProjectRepository;
import com.example.javabasiceproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public Project saveProject(Project project) {
        Project saveProject=projectRepository.save(project);

        return saveProject;
    }

    @Override
    public Project getProjectByCode(Long projectCode) {
        Project foundProject=projectRepository.findById(projectCode).get();
        return foundProject;
    }
}
