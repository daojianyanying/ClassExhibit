package com.common.people.klass.exhibit.entity.attribute;

public class LocalVariableTable {
    private Integer startPC;
    private Integer length;
    private Integer nameIndex;
    private Integer descriptorIndex;
    private Integer index;

    public LocalVariableTable setStartPC(Integer startPC) {
        this.startPC = startPC;
        return this;
    }

    public LocalVariableTable setLength(Integer length) {
        this.length = length;
        return this;
    }

    public LocalVariableTable setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public LocalVariableTable setSignatureIndex(Integer descriptorIndex) {
        this.descriptorIndex = descriptorIndex;
        return this;
    }

    public LocalVariableTable setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public Integer getStartPC() {
        return startPC;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getNameIndex() {
        return nameIndex;
    }

    public Integer getDescriptorIndex() {
        return descriptorIndex;
    }

    public Integer getIndex() {
        return index;
    }
}
