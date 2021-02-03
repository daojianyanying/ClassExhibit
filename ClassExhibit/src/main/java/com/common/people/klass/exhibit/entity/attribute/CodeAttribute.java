package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

import java.util.ArrayList;

public class CodeAttribute extends Attribute implements AttributeInfo {
    //属性的名称索引
    private String nameIndex;
    //属性的长度
    private Integer length;
    //栈的最大深度
    private Integer maxStack;
    //
    private Integer maxLocals;
    //操作码长度
    private Integer codeLength;
    //操作码
    private ArrayList<Code> Codes;
    //异常表的长度
    private Integer exceptionTableLength;
    //异常表
    private ArrayList<ExceptionTable> exceptionTables;
    //Code的属性表
    private Integer attributeInfoCount;
    //Code的属性
    private ArrayList<Attribute> attributes;

    public CodeAttribute setNameIndex(String nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    public CodeAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public CodeAttribute setMaxStack(Integer maxStack) {
        this.maxStack = maxStack;
        return this;
    }

    public CodeAttribute setMaxLocals(Integer maxLocals) {
        this.maxLocals = maxLocals;
        return this;
    }

    public CodeAttribute setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
        return this;
    }

    public CodeAttribute setCodes(ArrayList<Code> codes) {
        Codes = codes;
        return this;
    }

    public CodeAttribute setExceptionTableLength(Integer exceptionTableLength) {
        this.exceptionTableLength = exceptionTableLength;
        return this;
    }

    public CodeAttribute setExceptionTables(ArrayList<ExceptionTable> exceptionTables) {
        this.exceptionTables = exceptionTables;
        return this;
    }

    public CodeAttribute setAttributeInfoCount(Integer attributeInfoCount) {
        this.attributeInfoCount = attributeInfoCount;
        return this;
    }

    public CodeAttribute setAttributeInfos(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getMaxStack() {
        return maxStack;
    }

    public Integer getMaxLocals() {
        return maxLocals;
    }

    public Integer getCodeLength() {
        return codeLength;
    }

    public ArrayList<Code> getCodes() {
        return Codes;
    }

    public Integer getExceptionTableLength() {
        return exceptionTableLength;
    }

    public ArrayList<ExceptionTable> getExceptionTables() {
        return exceptionTables;
    }

    public Integer getAttributeInfoCount() {
        return attributeInfoCount;
    }

    public ArrayList<Attribute> getAttributeInfos() {
        return attributes;
    }
}
