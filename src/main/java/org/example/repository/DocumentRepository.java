package org.example.repository;


import org.example.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

//    List<Document> findByDocumentNoAndTitleAndOwnerDptDepartmentCodeAndTypeAndSecurityTypesAndCreatedAtGreaterThanEqualAndCreatedAtLessThanEqual
//            (String documentNo, String title, String code, DocumentType type, SecurityClassificationTypes securityType, LocalDate startDate,LocalDate endDate,
//             Pageable pageable);

}
