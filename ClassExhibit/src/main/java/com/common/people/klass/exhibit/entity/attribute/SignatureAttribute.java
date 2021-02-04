package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

public class SignatureAttribute extends Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;
    private Integer signatureIndex;

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

    public SignatureAttribute setSignatureIndex(Integer signatureIndex) {
        this.signatureIndex = signatureIndex;
        return this;
    }

    public Integer getSignatureIndex() {
        return signatureIndex;
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
