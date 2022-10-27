package com.boot.wiki.dao;

import com.boot.wiki.mapper.DocumentMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public class DocumentDao {
    DocumentMapper documentMapper;
}
