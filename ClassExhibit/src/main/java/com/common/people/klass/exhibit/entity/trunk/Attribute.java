package com.common.people.klass.exhibit.entity.trunk;

import com.common.people.klass.exhibit.entity.attribute.AttributeInfo;

import java.util.ArrayList;

public class Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;
    private ArrayList<Info> infos;

    public Attribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public Attribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Attribute setInfos(ArrayList<Info> infos) {
        this.infos = infos;
        return this;
    }

    public Integer getNameIndex() {
        return nameIndex;
    }

    public Integer getLength() {
        return length;
    }

    public ArrayList<Info> getInfos() {
        return infos;
    }

}
