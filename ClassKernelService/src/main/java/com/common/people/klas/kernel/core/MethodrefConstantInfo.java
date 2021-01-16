package com.common.people.klas.kernel.core;

public class MethodrefConstantInfo implements Constant{
    private static final String TAG = "10";
    private static final String DESCRIPTION = "相当于Constant_Methond_Info,方法类型所占字节长度为5";

    private String classValue;

    private String classIndex;
    private String nameAndTypeIndex;


    public MethodrefConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public MethodrefConstantInfo setClassIndex(String classIndex){
        this.classIndex = classIndex;
        return this;
    }

    public MethodrefConstantInfo setNameAndTypeIndex(String nameAndTypeIndex){
        this.nameAndTypeIndex = nameAndTypeIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
