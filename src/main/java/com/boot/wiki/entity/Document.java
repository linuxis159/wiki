package com.boot.wiki.entity;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Document extends Entity{
    private long documentId;
    private String title;
    private List<Contents> contentsList;
    private LocalDateTime createdDate;
    private String createdUsr;
    private LocalDateTime updatedDate;
    private String updatedUsr;
    public Document(String title){
        documentId = createPK(this.getClass().getSimpleName());
    }

}
