package org.example.service;

import org.apache.coyote.BadRequestException;
import org.example.vo.DocumentRqVo;
import org.example.vo.DocumentRsVo;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


public interface DocumentService {
    String create(DocumentRqVo req);

    Page<DocumentRsVo> search(DocumentRqVo req) throws BadRequestException;
}
