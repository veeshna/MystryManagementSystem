package org.example.vo;

import lombok.Builder;
import lombok.Data;
import org.example.entity.Department;
import org.example.enums.DocumentType;
import org.example.enums.SecurityClassificationTypes;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class DocumentRsVo {
    private Long id;
    private String documentNo;

    private String title;

    private String description;

    private LocalDate CreatedAt;
    private Department ownerDpt;
    private DocumentType type;
    private SecurityClassificationTypes securityTypes;
    private String fileLocation;
    private double version;
}
