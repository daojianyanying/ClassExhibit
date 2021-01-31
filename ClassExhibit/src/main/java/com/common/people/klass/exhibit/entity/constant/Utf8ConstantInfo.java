package com.common.people.klass.exhibit.entity.constant;

import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class Utf8ConstantInfo implements Constant {
    private static final String TAG = "1";
    //解释utf-8_constant_info的作用
    private static final String DESCRIPTION = "这是Constant_Utf-8_Info结构，用于表示字符常量的值，所占字节数";

    //显示XXD生成的字节码文件的字面值
    private String classValue;

    private Integer length;
    private byte[] bytes;
    private String name;

    public void setClassValue(String classValue){
        this.classValue = classValue;
    }

    public void setLength(Integer length){
        this.length = length;
    }

    public void setBytes(byte[] bytes){
        this.bytes = bytes;
        this.name = new String(bytes);
    }

    public byte[] getBytes() {
        return bytes;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {

    }
}
