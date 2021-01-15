package com.common.people.klas.kernel.core;

import java.util.Arrays;

public class Utf8ConstantInfo implements Constant {
    private String tag;
    //显示XXD生成的字节码文件的字面值
    private String classValue;
    //解释utf-8_constant_info的作用
    private String description;

    private Integer length;
    private byte[] bytes;

    public Utf8ConstantInfo(){
        this.tag = "1";
        this.description = "这是Constant_Utf-8_Info结构，用于表示字符常量的值，所占字节数为1+2"+ this.length;
    }

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
                "tag='" + tag + '\'' +
                ", classValue='" + classValue + '\'' +
                ", description='" + description + '\'' +
                ", length=" + length +
                ", bytes=" + Arrays.toString(bytes) +
                '}';
    }

    @Override
    public String getDescription() {
        return description;
    }
}
