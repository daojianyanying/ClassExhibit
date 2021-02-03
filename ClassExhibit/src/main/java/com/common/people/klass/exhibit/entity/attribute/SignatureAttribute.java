package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

public class SignatureAttribute extends Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;

    @Override
    public SignatureAttribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    @Override
    public SignatureAttribute setLength(Integer length) {
        this.length = length;
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
}
