package com.common.people.klass.exhibit.core;

import java.util.Arrays;

public class Utf8ConstantInfo implements Constant {
    private static final String TAG = "1";
    //解释utf-8_constant_info的作用
    private static final String DESCRIPTION = "这是Constant_Utf-8_Info结构，用于表示字符常量的值，所占字节数";

    //显示XXD生成的字节码文件的字面值
    private String classValue;

    private Integer length;
    private byte[] bytes;

    public void setClassValue(String classValue){
        this.classValue = classValue;
    }

    public void setLength(Integer length){
        this.length = length;
    }

    public void setBytes(byte[] bytes){
        this.bytes = bytes;
    }

    @Override
    public String toString() {
        return "Utf8ConstantInfo{" +
                "tag='" + TAG + '\'' +
                ", classValue='" + classValue + '\'' +
                ", description='" + DESCRIPTION + '\'' +
                ", length=" + length +
                ", bytes=" + Arrays.toString(bytes) +
                '}';
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
