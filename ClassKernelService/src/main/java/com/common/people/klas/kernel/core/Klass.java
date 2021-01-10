package com.common.people.klas.kernel.core;


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
    private ConstantPool constants;
    //类的访问控制符权限
    private String access_flags;
    //类名
    private String klass_name;
    //父类名
    private String super_klass_name;
    //接口个数
    private Integer interface_count;
    //接口
    private KInterface interfaces;
    //域的个数
    private Integer field_count;
    //域
    private Field fields;
    //方法个数
    private Integer method_count;
    //方法
    private Method methods;
    //附加属性个数
    private Integer attribute_count;
    //附加属性
    private Attribute attributes;

    public Klass(String magic, Integer minor_version, Integer major_version, Integer constant_count, ConstantPool constants, String access_flags, String klass_name, String super_klass_name, Integer interface_count, KInterface interfaces, Integer field_count, Field fields, Integer method_count, Method methods, Integer attribute_count, Attribute attributes) {
        this.magic = magic;
        this.minor_version = minor_version;
        this.major_version = major_version;
        this.constant_count = constant_count;
        this.constants = constants;
        this.access_flags = access_flags;
        this.klass_name = klass_name;
        this.super_klass_name = super_klass_name;
        this.interface_count = interface_count;
        this.interfaces = interfaces;
        this.field_count = field_count;
        this.fields = fields;
        this.method_count = method_count;
        this.methods = methods;
        this.attribute_count = attribute_count;
        this.attributes = attributes;
    }

    public Klass() {
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public Integer getMinor_version() {
        return minor_version;
    }

    public void setMinor_version(Integer minor_version) {
        this.minor_version = minor_version;
    }

    public Integer getMajor_version() {
        return major_version;
    }

    public void setMajor_version(Integer major_version) {
        this.major_version = major_version;
    }

    public Integer getConstant_count() {
        return constant_count;
    }

    public void setConstant_count(Integer constant_count) {
        this.constant_count = constant_count;
    }

    public ConstantPool getConstants() {
        return constants;
    }

    public void setConstants(ConstantPool constants) {
        this.constants = constants;
    }

    public String getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(String access_flags) {
        this.access_flags = access_flags;
    }

    public String getKlass_name() {
        return klass_name;
    }

    public void setKlass_name(String klass_name) {
        this.klass_name = klass_name;
    }

    public String getSuper_klass_name() {
        return super_klass_name;
    }

    public void setSuper_klass_name(String super_klass_name) {
        this.super_klass_name = super_klass_name;
    }

    public Integer getInterface_count() {
        return interface_count;
    }

    public void setInterface_count(Integer interface_count) {
        this.interface_count = interface_count;
    }

    public KInterface getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(KInterface interfaces) {
        this.interfaces = interfaces;
    }

    public Integer getField_count() {
        return field_count;
    }

    public void setField_count(Integer field_count) {
        this.field_count = field_count;
    }

    public Field getFields() {
        return fields;
    }

    public void setFields(Field fields) {
        this.fields = fields;
    }

    public Integer getMethod_count() {
        return method_count;
    }

    public void setMethod_count(Integer method_count) {
        this.method_count = method_count;
    }

    public Method getMethods() {
        return methods;
    }

    public void setMethods(Method methods) {
        this.methods = methods;
    }

    public Integer getAttribute_count() {
        return attribute_count;
    }

    public void setAttribute_count(Integer attribute_count) {
        this.attribute_count = attribute_count;
    }

    public Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Attribute attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Klass{" +
                "magic='" + magic + '\'' +
                ", minor_version=" + minor_version +
                ", major_version=" + major_version +
                ", constant_count=" + constant_count +
                ", constants=" + constants +
                ", access_flags='" + access_flags + '\'' +
                ", klass_name='" + klass_name + '\'' +
                ", super_klass_name='" + super_klass_name + '\'' +
                ", interface_count=" + interface_count +
                ", interfaces=" + interfaces +
                ", field_count=" + field_count +
                ", fields=" + fields +
                ", method_count=" + method_count +
                ", methods=" + methods +
                ", attribute_count=" + attribute_count +
                ", attributes=" + attributes +
                '}';
    }
}
