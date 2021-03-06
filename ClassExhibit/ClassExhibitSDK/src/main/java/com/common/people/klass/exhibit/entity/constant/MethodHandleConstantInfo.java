package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class MethodHandleConstantInfo implements Constant {

    private static final String TAG = "15";
    private static final String DESCRIPTION = "相当于Constant_MethondHandle_Info,方法类型所占字节长度为4";

    private String classValue;
    private String referenceKind;
    private String referenceIndex;
    private String referenceName;

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

    public String getReferenceName() {
        return referenceName;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {
        Utf8ConstantInfo utf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(this.referenceIndex));
        this.referenceName = new String(utf8ConstantInfo.getBytes());
    }
}
