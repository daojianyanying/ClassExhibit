package com.common.people.klass.exhibit.core;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConstantPool {
    private Integer ConstantCount;
    private ArrayList<Constant> constants;

    public void setConstantCount(Integer constantCount) {
        ConstantCount = constantCount;
    }

    public void setConstants(ArrayList<Constant> constants) {
        this.constants = constants;
    }

    public Integer getConstantCount() {
        return ConstantCount;
    }

    public ArrayList<Constant> getConstants() {
        return constants;
    }
}
