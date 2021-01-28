package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

public class ClassConstantInfo implements Constant {
    private static final String TAG = "7";
    private static final String DESCRIPTION = "相当于Constant_Class_Info,所占字节长度为3";

    private String classValue;

    private String nameIndex;

    public ClassConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public ClassConstantInfo setNameIndex(String nameIndex){
        this.nameIndex = nameIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
