package com.common.people.klass.exhibit.entity.attribute;

public class LineNumberTable {
    private Integer startPC;
    private Integer lineNumber;

    public LineNumberTable setStartPC(Integer startPC) {
        this.startPC = startPC;
        return this;
    }

    public LineNumberTable setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }
}
