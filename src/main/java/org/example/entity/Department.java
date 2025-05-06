package org.example.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.hibernate.annotations.IdGeneratorType;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
@Data
@Entity
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
