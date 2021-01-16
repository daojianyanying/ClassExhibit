package com.common.people.klass.exhibit.core;

public class MethodTypeConstantInfo implements Constant{
    private static final String TAG = "16";
    private static final String DESCRIPTION = "方法类型表,相当于Constant_MethondHandle_Info,方法类型所占字节长度为4";

    private String classValue;

    private String descriptionIndex;


    public MethodTypeConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public MethodTypeConstantInfo setDescriptionIndex(String descriptionIndex){
        this.descriptionIndex = descriptionIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
