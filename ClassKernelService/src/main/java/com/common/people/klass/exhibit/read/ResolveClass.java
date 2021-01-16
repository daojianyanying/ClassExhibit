package com.common.people.klass.exhibit.read;

import com.common.people.klass.exhibit.core.Klass;

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
        this.klass.setMagic(list.get(0) + list.get(1) + list.get(2) + list.get(3));
        this.klass.setMinor_version(Integer.parseInt(list.get(4)+list.get(5)));
        this.klass.setMajor_version(Integer.parseInt(list.get(6)+list.get(7),16));
    }
}
