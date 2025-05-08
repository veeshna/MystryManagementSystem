package org.example.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.entity.Department;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentRqVo {
    private String documentNo;

    private String title;

    private String description;

    private LocalDate createdAt;
    private Department ownerDpt;
    private String type;
    private String securityTypes;
    private String fileLocation;
//    private double version;

//    private LocalDate startDate;
    private LocalDate endDate;

    private Pageable pageable;
}
