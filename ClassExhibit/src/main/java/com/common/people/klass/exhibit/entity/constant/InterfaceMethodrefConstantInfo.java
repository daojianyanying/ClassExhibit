package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class InterfaceMethodrefConstantInfo implements Constant {
    private static final String TAG = "11";
    private static final String DESCRIPTION = "相当于Constant_Methond_Info,方法类型所占字节长度为5";

    private String classValue;
    private String classIndex;
    private String className;
    private String nameAndTypeName;
    private String nameAndTypeIndex;


    public InterfaceMethodrefConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public InterfaceMethodrefConstantInfo setClassIndex(String classIndex){
        this.classIndex = classIndex;
        return this;
    }

    public InterfaceMethodrefConstantInfo setNameAndTypeIndex(String nameAndTypeIndex){
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
        Utf8ConstantInfo utf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(classIndex,16));
        this.className = new String(utf8ConstantInfo.getBytes());
        NameAndTypeConstantInfo nameAndTypeConstantInfo = (NameAndTypeConstantInfo)constants.get(Integer.parseInt(this.nameAndTypeIndex,16));
        Utf8ConstantInfo nameUtf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(nameAndTypeConstantInfo.getNameIndex(),16));;
        Utf8ConstantInfo descriptionUtf8ConstantInfo = (Utf8ConstantInfo)constants.get(Integer.parseInt(nameAndTypeConstantInfo.getDescriptionIndex(),16));
        this.nameAndTypeName = new String(nameUtf8ConstantInfo.getBytes()) + new String(descriptionUtf8ConstantInfo.getBytes());
    }
}
