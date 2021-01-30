package com.common.people.klass.exhibit.entity.attribute;

public class ConstantValueAttribute implements AttributeInfo{
    private String nameIndex;
    private Integer length;
    private Integer constantValueIndex;

    public String getNameIndex() {
        return nameIndex;

    }

    public ConstantValueAttribute setNameIndex(String nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public ConstantValueAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getConstantValueIndex() {
        return constantValueIndex;
    }

    public ConstantValueAttribute setConstantValueIndex(Integer constantValueIndex) {
        this.constantValueIndex = constantValueIndex;
        return this;
    }
}
