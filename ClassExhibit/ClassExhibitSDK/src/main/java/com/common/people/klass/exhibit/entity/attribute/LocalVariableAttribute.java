package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

import java.util.ArrayList;

public class LocalVariableAttribute extends Attribute implements AttributeInfo{
    private String nameIndex;
    private Integer length;
    private Integer localVariableTypeLength;
    private ArrayList<LocalVariableTable> localVariableTables;

    public Integer getLength() {
        return length;
    }

    public Integer getLocalVariableTypeLength() {
        return localVariableTypeLength;
    }

    public ArrayList<LocalVariableTable> getLocalVariableTypeTables() {
        return localVariableTables;
    }

    public LocalVariableAttribute setNameIndex(String nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public LocalVariableAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public LocalVariableAttribute setLocalVariableTypeLength(Integer localVariableTypeLength) {
        this.localVariableTypeLength = localVariableTypeLength;
        return this;
    }

    public LocalVariableAttribute setLocalVariableTypeTables(ArrayList<LocalVariableTable> localVariableTables) {
        this.localVariableTables = localVariableTables;
        return this;
    }
}

