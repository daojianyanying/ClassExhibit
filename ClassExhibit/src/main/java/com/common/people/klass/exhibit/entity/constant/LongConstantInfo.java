package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

public class LongConstantInfo implements Constant {
    private String TAG = "5";
    private static final String DESCRIPTION = "CONSTANT_Long_info,整型字面量长度为8个字节";

    private byte[] highBytes = new byte[4];
    private byte[] lowBytes = new byte[4];
    private String classValue;
    private long realValue;

    public LongConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public LongConstantInfo setHighBytes(byte[] highBytes){
        this.highBytes = highBytes;
        return this;
    }

    public LongConstantInfo setLowBytes(byte[] lowBytes){
        this.lowBytes = lowBytes;
        return this;
    }

    public LongConstantInfo setRealValue(long realValue){
        this.realValue = realValue;
        return this;
    }
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
