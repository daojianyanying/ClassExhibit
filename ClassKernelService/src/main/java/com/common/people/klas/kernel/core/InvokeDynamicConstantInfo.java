package com.common.people.klas.kernel.core;

public class InvokeDynamicConstantInfo implements Constant{
    private static final String TAG = "18";
    private static final String DESCRIPTION = "用于表示invokedynamic指令所用到的引导方法、参数、返回类型,并可以给引导方法传入一系列称为静态参数的常量" +
            "引导方法所用到的动态调用名称，相当于Constant_MethondHandle_Info,方法类型所占字节长度为4";

    private String classValue;
    private String bootstrapMethodAttrIndex;
    private String nameAndTypeIndex;


    public InvokeDynamicConstantInfo setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public InvokeDynamicConstantInfo setBootstrapMethodAttrIndex(String bootstrapMethodAttrIndex){
        this.bootstrapMethodAttrIndex = bootstrapMethodAttrIndex;
        return this;
    }

    public InvokeDynamicConstantInfo setNameAndTypeIndex(String nameAndTypeIndex){
        this.nameAndTypeIndex = nameAndTypeIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

