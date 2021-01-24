package com.common.people.klass.exhibit.core;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {
        double d = 1.2547;
        long l = 41747474174L;
        float f = 2.36f;
        int i =9;
        Constant c1 = new StringConstantInfo();
        System.out.println("这是一个主类！！！" + Charset.defaultCharset());
        System.out.println(f);
        System.out.println(i);
        char c = 'p';
        System.out.println(c+d+l);
    }
}
