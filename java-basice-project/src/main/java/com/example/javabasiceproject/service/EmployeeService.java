package com.example.javabasiceproject.service;

import com.example.javabasiceproject.entity.Employee;
import com.example.javabasiceproject.payload.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(Employee employee);

    EmployeeDto getEmployeeById(Long employeeId);
}
