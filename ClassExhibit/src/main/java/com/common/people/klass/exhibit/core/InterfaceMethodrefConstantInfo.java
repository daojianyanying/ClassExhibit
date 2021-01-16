package com.common.people.klass.exhibit.core;

public class InterfaceMethodrefConstantInfo implements Constant{
    private static final String TAG = "11";
    private static final String DESCRIPTION = "相当于Constant_Methond_Info,方法类型所占字节长度为5";

    private String classValue;
    private String classIndex;
    private String nameAndTypeIndex;


    public InterfaceMethodrefConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public InterfaceMethodrefConstantInfo setClassIndex(String classIndex){
        this.classIndex = classIndex;
        return this;
    }

    public InterfaceMethodrefConstantInfo setNameAndTypeIndex(String nameAndTypeIndex){
        this.nameAndTypeIndex = nameAndTypeIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
