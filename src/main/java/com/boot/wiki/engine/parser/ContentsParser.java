package com.boot.wiki.engine.parser;

import com.boot.wiki.dto.DocumentDto;
import com.boot.wiki.entity.Document;

import java.util.Stack;

public class ContentsParser implements Parserable{
    @Override
    public String parse(DocumentDto documentDto) {
        final char symbol = '=';
        String[] lines = documentDto.getArtcie().split("\n");
        Stack stack = new Stack();
        for(String line : lines){
            String contentsString = "";
            Outter :
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i) == symbol){
                    for(;line.charAt(i) == '=' && i<line.length() ;i++){
                        stack.push(line.charAt(i));
                    }
                    for(;line.charAt(i) != '=' && i<line.length() ;i++){
                        contentsString += line.charAt(i);
                    }
                    for(;line.charAt(i) == '=' && i<line.length() ;i++){
                        if(stack.isEmpty()){
                            break Outter;
                        }
                        else
                            stack.pop();
                    }
                    if(stack.isEmpty())
                        documentDto.set
                        return contentsString;
                    else
                        break Outter;

                }
            }
            return null;
        }
        return null;
    }
}
