package com.boot.wiki.entity;

import com.boot.wiki.mapper.SequenceMapper;

public abstract class Entity {
    SequenceMapper sequenceMapper;

    public long createPK(String entityName){
        String sequenceName = entityName + "_ID_SEQ";
        return sequenceMapper.createSequence(sequenceName);

    }

}
