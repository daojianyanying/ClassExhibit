package com.common.people.klass.exhibit.entity.trunk;

import java.util.ArrayList;

public class Field {
    public String accessFlag;
    public Integer nameIndex;
    public Integer descriptionIndex;
    public Integer attributeCount;
    public ArrayList attributes = new ArrayList<Attribute>();

    public Field setAccessFlag(String accessFlag){
        this.accessFlag = accessFlag;
        return this;
    }

    public Field setNameIndex(Integer nameIndex){
        this.nameIndex = nameIndex;
        return this;
    }

    public Field setDescriptionIndex(Integer descriptionIndex) {
        this.descriptionIndex = descriptionIndex;
        return this;
    }

    public Field setAttributeCount(Integer attributeCount) {
        this.attributeCount = attributeCount;
        return this;
    }

    public Field setAttributes(ArrayList attributes) {
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
