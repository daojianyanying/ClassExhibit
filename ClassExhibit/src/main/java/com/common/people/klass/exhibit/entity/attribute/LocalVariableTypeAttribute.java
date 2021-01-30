package com.common.people.klass.exhibit.entity.attribute;

import java.util.ArrayList;

public class LocalVariableTypeAttribute implements AttributeInfo{
    private String nameIndex;
    private Integer length;
    private Integer localVariableTypeLength;
    private ArrayList<LocalVariableTypeTable> LocalVariableTypeTables;

    public String getNameIndex() {
        return nameIndex;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getLocalVariableTypeLength() {
        return localVariableTypeLength;
    }

    public ArrayList<LocalVariableTypeTable> getLocalVariableTypeTables() {
        return LocalVariableTypeTables;
    }

    public LocalVariableTypeAttribute setNameIndex(String nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public LocalVariableTypeAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public LocalVariableTypeAttribute setLocalVariableTypeLength(Integer localVariableTypeLength) {
        this.localVariableTypeLength = localVariableTypeLength;
        return this;
    }

    public LocalVariableTypeAttribute setLocalVariableTypeTables(ArrayList<LocalVariableTypeTable> LocalVariableTypeTables) {
        this.LocalVariableTypeTables = LocalVariableTypeTables;
        return this;
    }
}

