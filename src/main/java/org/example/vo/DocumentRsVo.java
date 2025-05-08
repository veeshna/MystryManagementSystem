package org.example.vo;

import lombok.Builder;
import lombok.Data;
import org.example.entity.Department;


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
    private String type;
    private String securityTypes;
    private String fileLocation;
    private double version;
}
