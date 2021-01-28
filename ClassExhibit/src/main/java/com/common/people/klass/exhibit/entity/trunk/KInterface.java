package com.common.people.klass.exhibit.entity.trunk;

public class KInterface {
    private String classValues;
    private String realValues;

    public KInterface setClassValues(String classValues) {
        this.classValues = classValues;
        return this;
    }

    public KInterface setRealValues(String realValues) {
        this.realValues = realValues;
        return this;
    }

    public String getClassValues() {
        return classValues;
    }

    public String getRealValues() {
        return realValues;
    }
}
