package com.common.people.klass.exhibit.entity.trunk;

import com.common.people.klass.exhibit.entity.constant.Utf8ConstantInfo;

import java.util.ArrayList;

public class Field {
    private String accessFlag;
    private Integer nameIndex;
    private Integer descriptionIndex;
    private Integer attributeCount;
    private ArrayList attributes = new ArrayList<Attribute>();

    private String name;
    private String description;

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

    public Field setIndex(ArrayList<Constant> constants){
        this.name =new String(((Utf8ConstantInfo)constants.get(nameIndex)).getBytes());
        this.description = new String(((Utf8ConstantInfo)constants.get(descriptionIndex)).getBytes());
        return  this;
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
