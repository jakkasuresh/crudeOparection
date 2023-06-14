package com.example.javabasiceproject.service.impl;

import com.example.javabasiceproject.entity.Employee;
import com.example.javabasiceproject.entity.Project;
import com.example.javabasiceproject.payload.EmployeeDto;
import com.example.javabasiceproject.repository.EmployeeRepository;
import com.example.javabasiceproject.repository.ProjectRepository;
import com.example.javabasiceproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public EmployeeDto saveEmployee(Employee employee) {
        Employee saveEmployee=employeeRepository.save(employee);
        Project project=projectRepository.findByProjectCode(saveEmployee.getAssignedProject());
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setEmployeeName(employee.getEmployeeName());
        employeeDto.setEmployeeEmail(employee.getEmployeeEmail());
        employeeDto.setProjectCode(project.getProjectCode());
        employeeDto.setProjectName(project.getProjectName());
        return employeeDto;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee foundEmployee=employeeRepository.findById(employeeId).get();
        Project project=projectRepository.findByProjectCode(foundEmployee.getAssignedProject());
        EmployeeDto employeeDto=new EmployeeDto();
        employeeDto.setId(foundEmployee.getId());
        employeeDto.setEmployeeName(foundEmployee.getEmployeeName());
        employeeDto.setEmployeeEmail(foundEmployee.getEmployeeEmail());
        employeeDto.setEmployeeBaseLocation(foundEmployee.getEmployeeBaseLocation());
        employeeDto.setProjectName(project.getProjectName());
        employeeDto.setProjectCode(project.getProjectCode());

        return employeeDto;
    }
}
