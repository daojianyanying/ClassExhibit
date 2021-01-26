package com.common.people.klass.exhibit.core;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Klass {
    //jdk版本对应的魔术
    private String magic;
    //jdk的副版本号
    private Integer minor_version;
    //jadk的主版本号
    private Integer major_version;
    //常量个数
    private Integer constant_count;
    //常量池
    private ConstantPool constant_pool;
    //类的访问控制符权限
    private String access_flags;
    //类名
    private String klass_name;
    //父类名
    private String super_klass_name;
    //接口个数
    private Integer interface_count;
    //接口
    private ArrayList<KInterface> interfaces;
    //域的个数
    private Integer field_count;
    //域
    private ArrayList<Field> fields;
    //方法个数
    private Integer method_count;
    //方法
    private Method methods;
    //附加属性个数
    private Integer attribute_count;
    //附加属性
    private Attribute additionalAttributes;
}
