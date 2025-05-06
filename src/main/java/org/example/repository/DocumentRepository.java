package org.example.repository;

import jakarta.persistence.Id;
import org.example.entity.Department;
import org.example.entity.Document;
import org.example.enums.CurrentState;
import org.example.enums.DocumentType;
import org.example.enums.SecurityClassificationTypes;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public interface DocumentRepository<Document, ID extends Serializable> extends JpaRepository<Document, ID> {

    List<Document> findByDocumentNoAndTitleAndOwnerDptDepartmentCodeAndTypeAndSecurityTypesAndCreatedAtGreaterThanEqualAndCreatedAtLessThanEqual
            (String documentNo, String title, String code, DocumentType type, SecurityClassificationTypes securityType, LocalDate startDate,LocalDate endDate,
             Pageable pageable);

}
