package com.example.javabasiceproject.controller;

import com.example.javabasiceproject.entity.Employee;
import com.example.javabasiceproject.payload.EmployeeDto;
import com.example.javabasiceproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping
    public EmployeeDto createEmployee(@RequestBody Employee employee){
        return  employeeService.saveEmployee(employee);
    }
    @GetMapping("/{employee_id}")
    public EmployeeDto getEmployeeBy(@PathVariable(name = "employee_id") Long employee_id){
        return employeeService.getEmployeeById(employee_id);
    }
}
