package com.common.people.klass.exhibit.entity.attribute;

import com.sun.org.apache.bcel.internal.classfile.ExceptionTable;

import java.util.ArrayList;

public class CodeAttribute implements Attribute{
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
}
