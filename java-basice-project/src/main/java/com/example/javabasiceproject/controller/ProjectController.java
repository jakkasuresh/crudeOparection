package com.example.javabasiceproject.controller;

import com.example.javabasiceproject.entity.Project;
import com.example.javabasiceproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping
    public Project createEmployee(@RequestBody Project project){
        return  projectService.saveProject(project);
    }
    @GetMapping("/{project_code}")
    public Project getEmployeeBy(@PathVariable(name = "project_code") Long project_code){
        return projectService.getProjectByCode(project_code);
    }
}
