package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class NameAndTypeConstantInfo implements Constant {

    private static final String TAG = "12";
    private static final String DESCRIPTION = "相当于Constant_NameAndType_Info,方法类型所占字节长度为5";

    private String classValue;

    private String nameIndex;
    private String name;
    private String descriptionIndex;
    private String descriptionName;


    public NameAndTypeConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public NameAndTypeConstantInfo setNameIndex(String nameIndex){
        this.nameIndex = nameIndex;
        return this;
    }

    public NameAndTypeConstantInfo setDescriptionIndex(String descriptionIndex){
        this.descriptionIndex = descriptionIndex;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getDescriptionName() {
        return descriptionName;
    }

    public String getClassValue() {
        return classValue;
    }

    public String getNameIndex() {
        return nameIndex;
    }

    public String getDescriptionIndex() {
        return descriptionIndex;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {
        Utf8ConstantInfo nameUtf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(nameIndex,16));
        this.name = new String(nameUtf8ConstantInfo.getBytes());
        Utf8ConstantInfo descriptionUtf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(descriptionIndex,16));
        this.descriptionName = new String(descriptionUtf8ConstantInfo.getBytes());
    }
}
