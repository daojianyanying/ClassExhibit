package com.common.people.klass.exhibit.entity.trunk;

import java.util.ArrayList;

public class ConstantPool {
    private ArrayList<Constant> constants;

    public void setConstants(ArrayList<Constant> constants) {
        this.constants = constants;
    }

    public ArrayList<Constant> getConstants() {
        return constants;
    }
}
