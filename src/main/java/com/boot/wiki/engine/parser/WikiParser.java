package com.boot.wiki.engine.parser;

import com.boot.wiki.dto.DocumentDto;
import com.boot.wiki.engine.WikiEditKeywordEnum;
import com.boot.wiki.entity.Contents;
import com.boot.wiki.entity.Document;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class WikiParser {
    private DocumentDto targetDocumentDto;

    public WikiParser(DocumentDto targetDocumentDto) {
        this.targetDocumentDto = targetDocumentDto;
    }

    //
    public void parse() {
        Parserable[] parserChain = {
                new LinkParser(),
                new ContentsParser()
        };
        for(Parserable parser : parserChain) {
            parser.parse(this.targetDocumentDto);
        }


    }

}