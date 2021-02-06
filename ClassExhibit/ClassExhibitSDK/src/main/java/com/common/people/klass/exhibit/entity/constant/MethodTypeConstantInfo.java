package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class MethodTypeConstantInfo implements Constant {
    private static final String TAG = "16";
    private static final String DESCRIPTION = "方法类型表,相当于Constant_MethondHandle_Info,方法类型所占字节长度为4";

    private String classValue;

    private String descriptionIndex;
    private String descriptionName;


    public MethodTypeConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public MethodTypeConstantInfo setDescriptionIndex(String descriptionIndex){
        this.descriptionIndex = descriptionIndex;
        return this;
    }

    public String getDescriptionName() {
        return descriptionName;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {
        Utf8ConstantInfo utf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(descriptionIndex));
        this.descriptionName = new String(utf8ConstantInfo.getBytes());
    }
}
