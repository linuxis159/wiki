package com.boot.wiki.dto;

import com.boot.wiki.entity.Document;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class DocumentDto {
    private long documentId;
    private String title;
    private String artcie;
    private DocumentNameDto documentNameDto;
    private HeaderContentsDto[] headerContentsDto;
    private List<ContentsDto> contentsDtoList;
    private DocumentClassificationDto documentClassificationDto;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdatedDate;
    public DocumentDto(String title, String article){
        this.contentsDtoList = new ArrayList();
        this.title = title;
        this.artcie = article;
    }
    public setContesnts(String title){
        ContentsDto contentsDto = new ContentsDto(title);
        contentsDtoList.add();
    }

}
