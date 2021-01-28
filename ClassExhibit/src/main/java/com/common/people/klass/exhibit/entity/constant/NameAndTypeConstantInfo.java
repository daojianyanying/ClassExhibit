package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

public class NameAndTypeConstantInfo implements Constant {

    private static final String TAG = "12";
    private static final String DESCRIPTION = "相当于Constant_NameAndType_Info,方法类型所占字节长度为5";

    private String classValue;

    private String nameIndex;
    private String descriptionIndex;


    public NameAndTypeConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public NameAndTypeConstantInfo setNameIndex(String nameIndex){
        this.nameIndex = nameIndex;
        return this;
    }

    public NameAndTypeConstantInfo setDescriptionIndex(String descriptionIndex){
        this.descriptionIndex = descriptionIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
