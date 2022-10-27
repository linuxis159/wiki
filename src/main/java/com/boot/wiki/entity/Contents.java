package com.boot.wiki.entity;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Contents extends Entity{
    private long contentsId;
    private long documentId;
    private String title;
    private String article;
    private LocalDateTime createdDate;
    private String createdUsr;
    private LocalDateTime updatedDate;
    private String updatedUsr;

}
