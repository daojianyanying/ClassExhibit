package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class ClassConstantInfo implements Constant {
    private static final String TAG = "7";
    private static final String DESCRIPTION = "相当于Constant_Class_Info,所占字节长度为3";

    private String classValue;

    private String nameIndex;
    private String name;

    public ClassConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public ClassConstantInfo setNameIndex(String nameIndex){
        this.nameIndex = nameIndex;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getNameIndex() {
        return nameIndex;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {
        Utf8ConstantInfo utf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(nameIndex,16));
        this.name = new String(utf8ConstantInfo.getBytes());
    }
}
