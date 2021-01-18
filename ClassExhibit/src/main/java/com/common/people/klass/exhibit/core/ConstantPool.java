package com.common.people.klass.exhibit.core;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConstantPool {
    private ArrayList<Constant> constants;

    public void setConstants(ArrayList<Constant> constants) {
        this.constants = constants;
    }

    public ArrayList<Constant> getConstants() {
        return constants;
    }
}
