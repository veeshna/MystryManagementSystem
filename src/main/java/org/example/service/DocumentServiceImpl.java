package org.example.service;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.example.entity.Document;
import org.example.repository.DocumentRepository;

import org.example.vo.DocumentRqVo;
import org.example.vo.DocumentRsVo;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService{
    private final DocumentRepository documentRepository;
    @Override
    public String create(DocumentRqVo req) {
        Document document = new Document();
        document.setDocumentNo(req.getDocumentNo());
        document.setTitle(req.getTitle());
        document.setCreatedAt(LocalDate.now());
        document.setType(req.getType());
        document.setSecurityTypes(req.getSecurityTypes());
        document.setDescription(req.getDescription());
        document.setFileLocation(req.getFileLocation());
        document.setVersion(1.0);
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
            List<Document> documentsByDocNo = new ArrayList<>();
//            documentRepository.findByDocumentNoAndTitleAndOwnerDptDepartmentCodeAndTypeAndSecurityTypesAndCreatedAtGreaterThanEqualAndCreatedAtLessThanEqual
//                    (req.getDocumentNo(),req.getTitle(),req.getOwnerDpt().getDepartmentCode(),req.getType(),req.getSecurityTypes(),req.getStartDate(),
//                            req.getEndDate(),req.getPageable());
            if (documentsByDocNo.isEmpty()){
                throw new BadRequestException("Invalid parameter value");
            }

       List<DocumentRsVo> res = new ArrayList<>();
       documentsByDocNo.forEach(d->{
//           DocumentRsVo.builder()
//                   .id(d.getId())
//                   .documentNo(d.getDocumentNo())
//                   .CreatedAt(d.getCreatedAt())
//                   .description(d.getDescription())
//                   .fileLocation(d.getFileLocation())
//                   .ownerDpt(d.getOwnerDpt())
//                   .securityTypes(d.getSecurityTypes())
//                   .title(d.getTitle())
//                   .type(d.getType())
//                   .version(d.getVersion())
//                   .build();
//           res.add(List.of(new DocumentRsVo()));
       });


        return (Page<DocumentRsVo>) res;
    }
}
