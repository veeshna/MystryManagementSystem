package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;



import java.time.LocalDate;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "document_no")
    private String documentNo;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "createdAt")
    private LocalDate createdAt;

//    @ManyToOne
//    @JoinColumn(name = "owner_dpt_id")
//    private Department ownerDpt;

    @Column(name = "type")
    private String type;

    @Column(name = "securityTypes")
    private String securityTypes;

    @Column(name = "fileLocation")
    private String fileLocation;

    @Column(name = "version")
    private double version = 0;
}
