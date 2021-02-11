package com.common.people.klass.exhibit.entity.attribute;

import com.common.people.klass.exhibit.entity.trunk.Attribute;

import java.util.ArrayList;

public class MethodParametersAttribute extends Attribute implements AttributeInfo {
    private Integer nameIndex;
    private Integer length;
    private Integer parametersCount;
    private ArrayList<Parameter> parameters;

    @Override
    public MethodParametersAttribute setNameIndex(Integer nameIndex) {
        this.nameIndex = nameIndex;
        return this;
    }

    @Override
    public MethodParametersAttribute setLength(Integer length) {
        this.length = length;
        return this;
    }

    public MethodParametersAttribute setParametersCount(Integer parametersCount) {
        this.parametersCount = parametersCount;
        return this;
    }

    public MethodParametersAttribute setParameters(ArrayList<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public Integer getNameIndex() {
        return nameIndex;
    }

    @Override
    public Integer getLength() {
        return length;
    }

    public Integer getParametersCount() {
        return parametersCount;
    }

    public ArrayList<Parameter> getParameters() {
        return parameters;
    }
}
