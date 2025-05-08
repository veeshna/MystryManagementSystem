package org.example.controller;

import jakarta.validation.Valid;
import org.apache.coyote.BadRequestException;
import org.example.service.DocumentService;
import org.example.vo.DocumentRqVo;
import org.example.vo.DocumentRsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "api/v1/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;
    @PostMapping("/create")
    public ResponseEntity<String> create(@Valid @RequestBody DocumentRqVo req) {
        String result = documentService.create(req);
        return ResponseEntity.ok(result);
    }
    @GetMapping("/search")
    public Page<DocumentRsVo> search(@RequestBody DocumentRqVo req) throws BadRequestException {
        return documentService.search(req);
    }

}
