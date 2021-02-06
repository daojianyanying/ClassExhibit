package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

public class SourceFileAttribute extends Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;
    private Integer sourceFileIndex;

    @Override
    public SourceFileAttribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    @Override
    public SourceFileAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public SourceFileAttribute setSourceFileIndex(Integer sourceFileIndex) {
        this.sourceFileIndex = sourceFileIndex;
        return this;
    }

    @Override
    public Integer getNameIndex() {
        return nameIndex;
    }

    @Override
    public Integer getLength() {
        return length;
    }

    public Integer getSourceFileIndex() {
        return sourceFileIndex;
    }
}
