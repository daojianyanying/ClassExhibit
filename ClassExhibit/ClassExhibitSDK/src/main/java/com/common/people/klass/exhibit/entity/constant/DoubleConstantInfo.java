package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class DoubleConstantInfo implements Constant {
    private String TAG = "6";
    private static final String DESCRIPTION = "CONSTANT_Double_info,双精度字面量长度为8个字节";


    private byte[] highBytes = new byte[4];
    private byte[] lowBytes = new byte[4];

    private String classValue;
    private double realValue;

    public DoubleConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public DoubleConstantInfo setHighBytes(byte[] highBytes){
        this.highBytes = highBytes;
        return this;
    }

    public DoubleConstantInfo setLowBytes(byte[] lowBytes){
        this.lowBytes = lowBytes;
        return this;
    }

    public DoubleConstantInfo setRealValue(double realValue){
        this.realValue = realValue;
        return this;
    }
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {

    }
}
