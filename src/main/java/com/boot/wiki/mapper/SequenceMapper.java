package com.boot.wiki.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SequenceMapper {
    @Select("SELECT #{sequence} FROM DUAL")
    long createSequence(String sequence);
}
