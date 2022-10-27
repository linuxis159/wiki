package com.boot.wiki.engine.parser;

import com.boot.wiki.dto.DocumentDto;
import com.boot.wiki.entity.Document;

public interface Parserable {
    String parse(DocumentDto targetDocumentDto);


}
