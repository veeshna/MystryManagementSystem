package org.example.vo;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.example.entity.Department;
import org.example.enums.DocumentType;
import org.example.enums.SecurityClassificationTypes;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

@Data
public class DocumentRqVo {
    private String documentNo;

    private String title;

    private String description;

    private LocalDate CreatedAt;
    private Department ownerDpt;
    private DocumentType type;
    private SecurityClassificationTypes securityTypes;
    private String fileLocation;
    private double version;

    private LocalDate startDate;
    private LocalDate endDate;

    private Pageable pageable;
}
