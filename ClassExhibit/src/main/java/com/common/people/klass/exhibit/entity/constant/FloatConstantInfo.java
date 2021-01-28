package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

public class FloatConstantInfo implements Constant {
    private String TAG = "4";
    private static final String DESCRIPTION = "CONSTANT_Float_info,整型字面量长度为4个字节";

    private byte[] bytes = new byte[4];
    private float realValue;
    private String classValue;



    public FloatConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public FloatConstantInfo setBytes(byte[] bytes){
        this.bytes = bytes;
        return this;
    }

    public FloatConstantInfo setRealValue(float realValue){
        this.realValue = realValue;
        return this;
    }


    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
