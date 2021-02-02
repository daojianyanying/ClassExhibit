package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

import java.util.ArrayList;

public class LineNumberAttribute extends Attribute implements AttributeInfo {
    private String nameIndex;
    private Integer length;
    private Integer lineNumberTableLength;
    private ArrayList<LineNumberTable> lineNumberTables;

    public LineNumberAttribute setNameIndex(String nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public LineNumberAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public LineNumberAttribute setLineNumberTableLength(Integer lineNumberTableLength) {
        this.lineNumberTableLength = lineNumberTableLength;
        return this;
    }

    public LineNumberAttribute setLineNumberTables(ArrayList<LineNumberTable> lineNumberTables) {
        this.lineNumberTables = lineNumberTables;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getLineNumberTableLength() {
        return lineNumberTableLength;
    }

    public ArrayList<LineNumberTable> getLineNumberTables() {
        return lineNumberTables;
    }
}
