package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

public class StackMapAttribute extends Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;
    private Integer entriesLength;

    @Override
    public StackMapAttribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    @Override
    public StackMapAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public StackMapAttribute setEntriesLength(Integer entriesLength) {
        this.entriesLength = entriesLength;
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

    public Integer getEntriesLength() {
        return entriesLength;
    }
}
