package com.example.javabasiceproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "employee",uniqueConstraints ={@UniqueConstraint(columnNames = {"employeeEmail"})})

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String employeeName;
    @Column(nullable = false)
    private String employeeEmail;
    @Column(nullable = false)
    private  Long assignedProject;
    @Column(nullable = false)
    private String employeeBaseLocation;

}
