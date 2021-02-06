package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

import java.util.ArrayList;

public class LocalVariableTypeAttribute extends Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;
    private Integer localVariableTypeTableLength;
    private ArrayList<LocalVariableTypeTable> localVariableTypeTables;

    @Override
    public LocalVariableTypeAttribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    @Override
    public LocalVariableTypeAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public LocalVariableTypeAttribute setLocalVariableTypeTableLength(Integer localVariableTypeTableLength) {
        this.localVariableTypeTableLength = localVariableTypeTableLength;
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

    public Integer getLocalVariableTypeTableLength() {
        return localVariableTypeTableLength;
    }

    public ArrayList<LocalVariableTypeTable> getLocalVariableTypeTables() {
        return localVariableTypeTables;
    }

    public LocalVariableTypeAttribute setLocalVariableTypeTables(ArrayList<LocalVariableTypeTable> localVariableTypeTables) {
        this.localVariableTypeTables = localVariableTypeTables;
        return this;
    }
}
