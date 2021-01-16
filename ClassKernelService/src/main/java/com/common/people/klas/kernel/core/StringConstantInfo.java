package com.common.people.klas.kernel.core;

public class StringConstantInfo implements Constant{
    private String TAG = "8";
    private static final String DESCRIPTION = "CONSTANT_Strng_info,整型字面量长度为3";

    private String stringIndex;

    private String classValue;

    public void setClassValue(String classValue){
        this.classValue = classValue;
    }

    public StringConstantInfo setStringIndex(String stringIndex){
        this.stringIndex = stringIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
