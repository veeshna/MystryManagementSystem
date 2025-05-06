package org.example.controller;

import org.apache.coyote.BadRequestException;
import org.example.service.DocumentService;
import org.example.vo.DocumentRqVo;
import org.example.vo.DocumentRsVo;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/documents")
public class DocumentController {
    private DocumentService documentService;
    @PostMapping("/create")
    public String create(@RequestBody DocumentRqVo req) {
        return documentService.create(req);
    }

    @GetMapping("/search")
    public Page<DocumentRsVo> search(@RequestBody DocumentRqVo req) throws BadRequestException {
        return documentService.search(req);
    }

}
