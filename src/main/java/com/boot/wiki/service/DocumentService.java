package com.boot.wiki.service;

import com.boot.wiki.dto.DocumentDto;
import com.boot.wiki.entity.Document;
import com.boot.wiki.mapper.DocumentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentService {
    private final DocumentMapper documentMapper;
    public DocumentDto findBySearchKeyword(String searchKeyword){
        return new DocumentDto();
    }
    public int createDocument(String title, String article){
        Document newDocumnet = new Document(title);


        documentMapper.saveDocument(title,article);
        return 1;
    }

}
