package com.example.javabasiceproject.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String employeeName;
    private String employeeEmail;
   private  Long assignedProject;
    private String employeeBaseLocation;
    private  Long projectCode;
    private String projectName;


}
