package com.common.people.klass.exhibit.entity.attribute;

public class LocalVariableTypeTable {
    private Integer startPC;
    private Integer length;
    private Integer nameIndex;
    private Integer signatureIndex;
    private Integer index;

    public LocalVariableTypeTable setStartPC(Integer startPC) {
        this.startPC = startPC;
        return this;
    }

    public LocalVariableTypeTable setLength(Integer length) {
        this.length = length;
        return this;
    }

    public LocalVariableTypeTable setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public LocalVariableTypeTable setSignatureIndex(Integer signatureIndex) {
        this.signatureIndex = signatureIndex;
        return this;
    }

    public LocalVariableTypeTable setIndex(Integer index) {
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

    public Integer getSignatureIndex() {
        return signatureIndex;
    }

    public Integer getIndex() {
        return index;
    }
}
