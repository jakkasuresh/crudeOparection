package com.example.javabasiceproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project",uniqueConstraints = {@UniqueConstraint(columnNames = {"projectCode"}) })
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)

    private  Long projectCode;
    @Column(nullable = false)

    private String projectName;
}
