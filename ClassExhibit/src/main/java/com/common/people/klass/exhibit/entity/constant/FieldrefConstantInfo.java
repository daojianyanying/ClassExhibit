package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

public class FieldrefConstantInfo implements Constant {
    private static final String TAG = "9";
    private static final String DESCRIPTION = "相当于Constant_Fielder_Info,字段类型所占字节长度为5";

    private String classValue;

    private String classIndex;
    private String nameAndTypeIndex;


    public FieldrefConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public FieldrefConstantInfo setClassIndex(String classIndex){
        this.classIndex = classIndex;
        return this;
    }

    public void setNameAndTypeIndex(String nameAndTypeIndex){
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    @Override
    public String getDescription() {
        return null;

    }
}
