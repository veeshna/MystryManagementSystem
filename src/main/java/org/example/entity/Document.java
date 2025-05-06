package org.example.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.example.enums.DocumentType;
import org.example.enums.SecurityClassificationTypes;

import java.time.LocalDate;

@Data
@Builder
@Table(name = "document")
@Entity
public class Document {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "document-no")
    private String documentNo;

    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "CreatedAt")
    private LocalDate CreatedAt;
    @Column(name = "department")
    @OneToOne
    private  Department ownerDpt; //(reference to Department)
    @Column(name = "type")
    private DocumentType type;
    @Column(name = "securityTypes")
    private SecurityClassificationTypes securityTypes;
    @Column(name = "fileLocation")
    private String fileLocation;
    @Column(name = "version")
    private double version;

    public Document() {

    }
}
