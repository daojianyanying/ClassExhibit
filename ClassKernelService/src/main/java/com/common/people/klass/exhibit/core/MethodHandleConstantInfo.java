package com.common.people.klass.exhibit.core;

public class MethodHandleConstantInfo implements Constant{

    private static final String TAG = "15";
    private static final String DESCRIPTION = "相当于Constant_MethondHandle_Info,方法类型所占字节长度为4";

    private String classValue;
    private String referenceKind;
    private String referenceIndex;

    public MethodHandleConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public MethodHandleConstantInfo setReferenceKind(String referenceKind){
        this.referenceKind = referenceKind;
        return this;
    }

    public MethodHandleConstantInfo setReferenceIndex(String referenceIndex){
        this.referenceIndex = referenceIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
