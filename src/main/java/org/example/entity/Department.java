package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;



@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "department")
public class Department {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "dpt-code")
    private String departmentCode;
    @Column(name = "dpt-name")
    private String departmentName;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private String status;



}
