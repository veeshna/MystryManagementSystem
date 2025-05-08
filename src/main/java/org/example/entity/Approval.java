package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.example.enums.ApprovalStatus;

import java.time.LocalDate;

@Data
@Table(name = "approval")
@Entity
public class Approval {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "documentWorkflow")
    private Long documentWorkflow;
    @Column(name = "department")
    private Long department;
    @Column(name = "status")
    private ApprovalStatus status;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "approvalId")
    private Long approvalId;

}
