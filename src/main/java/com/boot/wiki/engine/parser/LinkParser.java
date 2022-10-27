package com.boot.wiki.engine.parser;

import com.boot.wiki.dto.DocumentDto;
import com.boot.wiki.entity.Document;

public class LinkParser implements Parserable{

    @Override

    public String parse(DocumentDto documentDto) {
        final String startSymbol = "[";
        final String endSymbol = "]";
        return null;
    }
}
