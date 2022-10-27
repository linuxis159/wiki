package com.boot.wiki.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DocumentMapper {
    @Insert("INSERT INTO WIKI_DOCUMENT(DOCUMENT_ID, TITLE, ARTICLE, CREATED_DATE, CREATED_USR)" +
            "VALUES(DOCUMENT_ID_SEQ.NEXTVAL, #{title}, #{article}, SYSDATE, 'SYSTEM')")
    void saveDocument(String title, String article);


}
