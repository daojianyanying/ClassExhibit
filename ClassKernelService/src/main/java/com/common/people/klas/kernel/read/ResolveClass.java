package com.common.people.klas.kernel.read;

import com.common.people.klas.kernel.core.Klass;

import java.util.ArrayList;
import java.util.Map;

public class ResolveClass {
    private final Klass klass = new Klass(); //这里new和不new有什么区别

    public void resolve(Map<Integer, ArrayList<String>> classMap){
        resolveBasic(classMap.get(0));
    }

    public  Klass getKlass(){
        return this.klass;
    }


    public void resolveBasic(ArrayList<String> list){
        this.klass.setMagic(list.get(0) + list.get(1));
        this.klass.setMinor_version(Integer.parseInt(list.get(2)));
        this.klass.setMajor_version(Integer.parseInt(list.get(3),16));
    }
}
