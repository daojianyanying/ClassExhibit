package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class MethodrefConstantInfo implements Constant {
    private static final String TAG = "10";
    private static final String DESCRIPTION = "相当于Constant_Methond_Info,方法类型所占字节长度为5";

    private String classValue;

    private String classIndex;
    private String className;
    private String nameAndTypeIndex;
    private String nameAndTypeName;


    public MethodrefConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public MethodrefConstantInfo setClassIndex(String classIndex){
        this.classIndex = classIndex;
        return this;
    }

    public MethodrefConstantInfo setNameAndTypeIndex(String nameAndTypeIndex){
        this.nameAndTypeIndex = nameAndTypeIndex;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public String getNameAndTypeName() {
        return nameAndTypeName;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {
        ClassConstantInfo classConstantInfoInfo = (ClassConstantInfo)constants.get(Integer.parseInt(classIndex,16));
        Utf8ConstantInfo utf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(classConstantInfoInfo.getNameIndex(),16));
        this.className = new String(utf8ConstantInfo.getBytes());
        NameAndTypeConstantInfo nameAndTypeConstantInfo = (NameAndTypeConstantInfo)constants.get(Integer.parseInt(this.nameAndTypeIndex,16));
        Utf8ConstantInfo nameUtf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(nameAndTypeConstantInfo.getNameIndex(),16));;
        Utf8ConstantInfo descriptionUtf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(nameAndTypeConstantInfo.getDescriptionIndex(),16));
        this.nameAndTypeName = new String(nameUtf8ConstantInfo.getBytes()) + new String(descriptionUtf8ConstantInfo.getBytes());
    }
}
