package com.boot.wiki.controller;

import com.boot.wiki.dto.DocumentDto;
import com.boot.wiki.engine.parser.WikiParser;
import com.boot.wiki.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class DocumenController {
    private final DocumentService documentService;
    private static class DocumentDto{
        String title;
        String content[];
    }

    @GetMapping(value = {"/search"} )
    private String searchPage(String searchKeyword){
        documentService.findBySearchKeyword(searchKeyword);
        return "page/search_document";
    }

    @GetMapping(value = {"/create"} )
    private String createPage(){
        return "page/create_document";
    }

    @PostMapping(value = {"/create"} )
    private String createPage(String title, String article){
        DocumentDto documentDto = new DocumentDto(title, article);
        WikiParser wikiParser = new WikiParser(documentDto);
        wikiParser.parse();
        documentService.createDocument(title, article);
        return "page/create_document";
    }
}
