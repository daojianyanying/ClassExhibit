package com.common.people.klass.exhibit.entity.trunk;

import java.util.ArrayList;

public class Method {
    public String accessFlag;
    public Integer nameIndex;
    public Integer descriptionIndex;
    public Integer attributeCount;
    public ArrayList attributes = new ArrayList<Attribute>();
    private String attributeLength;

    public Method setAttributeLength(String attributeLength) {
        this.attributeLength = attributeLength;
        return this;
    }

    public Method setAccessFlag(String accessFlag){
        this.accessFlag = accessFlag;
        return this;
    }

    public Method setNameIndex(Integer nameIndex){
        this.nameIndex = nameIndex;
        return this;
    }

    public Method setDescriptionIndex(Integer descriptionIndex) {
        this.descriptionIndex = descriptionIndex;
        return this;
    }

    public Method setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
        return this;
    }

    public Method setAttributes(ArrayList attributes) {
        this.attributes = attributes;
        return this;
    }

    public String getAccessFlag() {
        return accessFlag;
    }

    public Integer getNameIndex() {
        return nameIndex;
    }

    public Integer getDescriptionIndex() {
        return descriptionIndex;
    }

    public Integer getAttributeCount() {
        return attributeCount;
    }

    public ArrayList getAttributes() {
        return attributes;
    }
}
