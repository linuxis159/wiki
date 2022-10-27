package com.boot.wiki.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ContentsDto {
    private long contentsId;
    private long documentId;
    private String title;
    private String article;
    private LocalDateTime createdDate;
    private String createdUsr;
    private LocalDateTime updatedDate;
    private String updatedUsr;

    public ContentsDto(String title){
        this.title = title;
    }


}
