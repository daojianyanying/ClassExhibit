package com.common.people.klass.exhibit.core;

public class IntegerConstantInfo implements Constant{
    private String TAG = "3";
    private static final String DESCRIPTION = "CONSTANT_Integer_info,整型字面量长度为4个字节";

    private byte[] bytes = new byte[4];
    private String classValue;
    private int realValue;

    public void setClassValue(String classValue){
        this.classValue = classValue;
    }

    public IntegerConstantInfo setBytes(byte[] bytes){
        this.bytes = bytes;
        return this;
    }

    public IntegerConstantInfo setRealValue(int realValue){
        this.realValue = realValue;
        return this;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
