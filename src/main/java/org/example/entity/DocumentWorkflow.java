package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.example.enums.CurrentState;


import java.time.LocalDate;

@Data
@Table(name = "document-work-flow")
@Entity
public class DocumentWorkflow {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "document")
    private Long document;
    @Column(name = "currentstate")
    private CurrentState currentstate;
    @Column(name = "modifiedAt")
    private LocalDate modifiedAt;
    @Column(name = "modifiedBy")
    private LocalDate modifiedBy;
    @Column(name = "comments")
    private String comments;


}
