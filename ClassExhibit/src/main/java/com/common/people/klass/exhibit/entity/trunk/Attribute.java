package com.common.people.klass.exhibit.entity.trunk;

import java.util.ArrayList;

public class Attribute {
    private Integer nameIndex;
    private Integer length;
    private ArrayList<Attribute> infos;

    public Attribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public Attribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Attribute setInfos(ArrayList<Attribute> infos) {
        this.infos = infos;
        return this;
    }

    public Integer getNameIndex() {
        return nameIndex;
    }

    public Integer getLength() {
        return length;
    }

    public ArrayList<Attribute> getInfos() {
        return infos;
    }

}
