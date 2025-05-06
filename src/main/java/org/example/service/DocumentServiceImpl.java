package org.example.service;

import org.apache.coyote.BadRequestException;
import org.example.entity.Department;
import org.example.entity.Document;
import org.example.repository.DocumentRepository;
import org.example.vo.DocumentRqVo;
import org.example.vo.DocumentRsVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

public class DocumentServiceImpl implements DocumentService{
    private static DocumentRepository documentRepository;
    @Override
    public String create(DocumentRqVo req) {
        Document document = Document.builder().documentNo(req.getDocumentNo())
                .CreatedAt(req.getCreatedAt())
                .title(req.getTitle())
                .description(req.getDescription())
                .fileLocation(req.getFileLocation())
                .version(req.getVersion())
                .type(req.getType())
                .securityTypes(req.getSecurityTypes())
                .ownerDpt(req.getOwnerDpt())
                .build();
        String res;
        try {
            documentRepository.save(document);
            res = "Created success!";
        }catch (RuntimeException e){
             throw new RuntimeException(e);
        }

        return res;
    }

    @Override
    public Page<DocumentRsVo> search(DocumentRqVo req) throws BadRequestException {
            List<Document> documentsByDocNo = documentRepository.findByDocumentNoAndTitleAndOwnerDptDepartmentCodeAndTypeAndSecurityTypesAndCreatedAtGreaterThanEqualAndCreatedAtLessThanEqual
                    (req.getDocumentNo(),req.getTitle(),req.getOwnerDpt().getDepartmentCode(),req.getType(),req.getSecurityTypes(),req.getStartDate(),
                            req.getEndDate(),req.getPageable());
            if (documentsByDocNo.isEmpty()){
                throw new BadRequestException("Invalid parameter value");
            }

       List<DocumentRsVo> res = new ArrayList<>();
       documentsByDocNo.forEach(d->{
           res.add(DocumentRsVo.builder()
                   .id(d.getId())
                   .documentNo(d.getDocumentNo())
                   .CreatedAt(d.getCreatedAt())
                   .description(d.getDescription())
                   .fileLocation(d.getFileLocation())
                   .ownerDpt(d.getOwnerDpt())
                           .securityTypes(d.getSecurityTypes())
                           .title(d.getTitle())
                           .type(d.getType())
                           .version(d.getVersion())
                   .build());
       });


        return (Page<DocumentRsVo>) res;
    }
}
