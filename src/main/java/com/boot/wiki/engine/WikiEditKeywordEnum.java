package com.boot.wiki.engine;

public enum WikiEditKeywordEnum {
    LINK("[[ "+"*"+" ]]"),
    CONTENTS("=")
    ;
    private final String pattern;
    private WikiEditKeywordEnum(String pattern){
        this.pattern = pattern;
    }
    public String getPattern(){
        return this.pattern;
    }

}
