package com.common.people.klass.exhibit.entity.attribute;

public class Parameter {
    private Integer nameIndex;
    private Integer accessFlag;

    public Parameter setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public Parameter setAccessFlag(Integer accessFlag) {
        this.accessFlag = accessFlag;
        return this;
    }

    public Integer getNameIndex() {
        return nameIndex;
    }

    public Integer getAccessFlag() {
        return accessFlag;
    }
}
