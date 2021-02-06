package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class StringConstantInfo implements Constant {
    private String TAG = "8";
    private static final String DESCRIPTION = "CONSTANT_Strng_info,整型字面量长度为3";

    private String stringIndex;
    private String stringName;

    private String classValue;

    public void setClassValue(String classValue){
        this.classValue = classValue;
    }

    public StringConstantInfo setStringIndex(String stringIndex){
        this.stringIndex = stringIndex;
        return this;
    }

    public String getStringName() {
        return stringName;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {
        Utf8ConstantInfo utf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(stringIndex,16));
        this.stringName = new String(utf8ConstantInfo.getBytes());
    }
}
