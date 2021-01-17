package com.common.people.klass.exhibit.read;

import com.common.people.klass.exhibit.core.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class ResolveClass {
    private final Klass klass = new Klass(); //这里new和不new有什么区别
    private Integer lineIndex = 0;

    public void resolve(Map<Integer, ArrayList<String>> classMap){
        resolveConstantPool(classMap,0,resolveBasic(classMap.get(lineIndex)));

    }

    public  Klass getKlass(){
        return this.klass;
    }


    public Integer resolveBasic(ArrayList<String> list){
        this.klass.setMagic(list.get(0) + list.get(1) + list.get(2) + list.get(3));
        this.klass.setMinor_version(Integer.parseInt(list.get(4)+list.get(5)));
        this.klass.setMajor_version(Integer.parseInt(list.get(6)+list.get(7),16));
        return 8;
    }
    public Integer resolveConstantPool(Map<Integer, ArrayList<String>> classMap, Integer lineIndex,Integer locationIndex){
        ConstantPool constantPool = new ConstantPool();
        ArrayList<Constant> constants = new ArrayList<>();
        constants.add(null);
        //读取常量池的数量
        String constantCount = classMap.get(lineIndex).get(locationIndex) + classMap.get(lineIndex).get(++locationIndex);
        constantPool.setConstantCount(Integer.parseInt(constantCount,16) - 1);
        //读取常量
        for(int count=0; count<constantPool.getConstantCount(); count++){
            String tag = null;
            if(locationIndex == 15){
                lineIndex++;
                locationIndex = 0;
                tag = classMap.get(lineIndex).get(locationIndex);
            }else{
                tag = classMap.get(lineIndex).get(++locationIndex);
            }


            switch(tag){
                case "01": {
                    Utf8ConstantInfo utf8Info = new Utf8ConstantInfo();
                    String[]  classValues_1 = new String[2];
                    for(int i=0; i<2; i++){
                        locationIndex++;
                        if(locationIndex == 15){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues_1[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    Integer length = Integer.parseInt(classValues_1[0]+classValues_1[1],16);
                    String[] classValues_2 = new String[length];
                    byte[] bytes = new byte[length];
                    for(int i=0; i<length; i++){
                        locationIndex++;
                        if(locationIndex == 15){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues_2[i] = classMap.get(lineIndex).get(locationIndex);
                        //bytes[i] = Integer.parseInt(classValues_2[i]);
                        //TODO
                    }
                    utf8Info.setLength(length);
                    utf8Info.setClassValue(mergeStringArray(classValues_1, classValues_2));
                    //TODO
                    utf8Info.setBytes(new byte[]{'T','O','D','O'});
                    constants.add(utf8Info);
                    break;
                }case "03": {
                    IntegerConstantInfo integerInfo = new IntegerConstantInfo();
                    String[] classValues = new String[2];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex++;
                        if(locationIndex == 15){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    integerInfo.setClassValue(mergeStringArray(classValues));
                    //TODO
                    integerInfo.setBytes(new byte[]{'T','O','D','O'});
                    constants.add(integerInfo);
                    break;
                }case "04": {
                    FloatConstantInfo floatInfo = new FloatConstantInfo();
                    String[] classValues = new String[2];
                    for(int i=0; i<2; i++){
                        locationIndex++;
                        if(locationIndex == 15){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    floatInfo.setClassValue(mergeStringArray(classValues))
                            //TODO
                            .setBytes(new byte[]{'T','O','D','O'});
                    constants.add(floatInfo);
                }case "05": {

                }case "06": {

                }case "07": {
                    ClassConstantInfo classInfo = new ClassConstantInfo();
                    String[]  classValues = new String[2];
                    for(int i=0; i<2; i++){
                        locationIndex++;
                        if(locationIndex == 16){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    classInfo.setClassValue(tag + classValues[0] + classValues[1]);
                    classInfo.setNameIndex(classValues[0] + classValues[1]);
                    constants.add(classInfo);
                    break;
                }case "08": {
                    StringConstantInfo stringInfo = new StringConstantInfo();
                    String[]  classValues = new String[2];
                    for(int i=0; i<2; i++){
                        locationIndex++;
                        if(locationIndex == 16){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    stringInfo.setClassValue(tag + classValues[0] + classValues[1]);
                    stringInfo.setStringIndex(classValues[0] + classValues[1]);
                    constants.add(stringInfo);
                    break;
                }case "09": {
                    FieldrefConstantInfo fieldref = new FieldrefConstantInfo();
                    String[]  classValues = new String[4];
                    for(int i=0; i<4; i++){
                        locationIndex++;
                        if(locationIndex == 16){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    fieldref.setClassValue(tag + classValues[0] + classValues[1] + classValues[2] + classValues[3]);
                    fieldref.setClassIndex(classValues[0] + classValues[1]);
                    fieldref.setNameAndTypeIndex(classValues[2] + classValues[3]);
                    constants.add(fieldref);
                    break;
                }case "0a": {
                    MethodrefConstantInfo methodref = new MethodrefConstantInfo();
                    String[]  classValues = new String[4];
                    for(int i=0; i<4; i++){
                        locationIndex++;
                        if(locationIndex == 16){
                            lineIndex++;
                            locationIndex = 0;
                        }
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    methodref.setClassValue(tag + classValues[0] + classValues[1] + classValues[2] + classValues[3]);
                    methodref.setClassIndex(classValues[0] + classValues[1]);
                    methodref.setNameAndTypeIndex(classValues[2]+classValues[3]);
                    constants.add(methodref);
                    break;
                }case "0b": {

                }case "0c": {

                }case "0f": {

                }case "10": {

                }case "12": {

                }
            }
        }

        return 0;
    }

    public String mergeStringArray(String[] mergeArrayFront,String[] mergerArrayAfter){
        String mergedResult="";
        for(int i=0; i<mergeArrayFront.length; i++){
            //为什么这里不能将mergedResult放到后面
            mergedResult = mergedResult + mergeArrayFront[i];
        }
        for(int i=0; i<mergerArrayAfter.length; i++){
            mergedResult = mergedResult + mergerArrayAfter[i];
        }
        return mergedResult;
    }

    public String mergeStringArray(String[] mergeArray){
        String mergedResult="";
        for(int i=0; i<mergeArray.length; i++){
            //为什么这里不能将mergedResult放到后面
            mergedResult = mergedResult + mergeArray[i];
        }

        return mergedResult;
    }
}
