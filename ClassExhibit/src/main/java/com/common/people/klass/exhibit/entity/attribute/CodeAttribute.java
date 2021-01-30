package com.common.people.klass.exhibit.entity.attribute;

import java.util.ArrayList;

public class CodeAttribute implements AttributeInfo{
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
    private ArrayList<AttributeInfo> attributeInfos;

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

    public CodeAttribute setAttributeInfos(ArrayList<AttributeInfo> attributeInfos) {
        this.attributeInfos = attributeInfos;
        return this;
    }

    public String getNameIndex() {
        return nameIndex;
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

    public ArrayList<AttributeInfo> getAttributeInfos() {
        return attributeInfos;
    }
}
class ExceptionTable{
    private Integer startPC;
    private Integer endPC;
    private Integer handlerPC;
    private Integer catchType;

    public ExceptionTable setStartPC(Integer startPC) {
        this.startPC = startPC;
        return this;
    }

    public ExceptionTable setEndPC(Integer endPC) {
        this.endPC = endPC;
        return this;
    }

    public ExceptionTable setHandlerPC(Integer handlerPC) {
        this.handlerPC = handlerPC;
        return this;
    }

    public ExceptionTable setCatchType(Integer catchType) {
        this.catchType = catchType;
        return this;
    }

    public Integer getStartPC() {
        return startPC;
    }

    public Integer getEndPC() {
        return endPC;
    }

    public Integer getHandlerPC() {
        return handlerPC;
    }

    public Integer getCatchType() {
        return catchType;
    }
}
