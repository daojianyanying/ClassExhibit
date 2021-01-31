package com.common.people.klass.exhibit.read;

import com.common.people.klass.exhibit.entity.attribute.*;
import com.common.people.klass.exhibit.entity.constant.*;
import com.common.people.klass.exhibit.entity.trunk.*;
import com.common.people.klass.exhibit.entity.trunk.Attribute;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.util.ArrayList;
import java.util.Map;

public class ResolveClass {
    private final Klass klass = new Klass(); //这里new和不new有什么区别
    private Integer lineIndex = 0;
    private Integer locationIndex = 0;

    public Klass resolve(Map<Integer, ArrayList<String>> classMap){
        resolveBasic(classMap.get(lineIndex));
        resolveConstantPool(classMap);
        resolveAccessFlag(classMap);
        resolveKlassName(classMap);
        resolveField(classMap);
        return this.klass;
    }

    public  Klass getKlass(){
        return this.klass;
    }


    public Integer resolveBasic(ArrayList<String> list){
        this.klass.setMagic(list.get(locationIndex++) + list.get(locationIndex++) + list.get(locationIndex++) + list.get(locationIndex++));
        this.klass.setMinor_version(Integer.parseInt(list.get(locationIndex++)+list.get(locationIndex++)));
        this.klass.setMajor_version(Integer.parseInt(list.get(locationIndex++)+list.get(locationIndex++),16));
        return locationIndex;
    }
    public Integer resolveConstantPool(Map<Integer, ArrayList<String>> classMap){
        ConstantPool constantPool = new ConstantPool();
        ArrayList<Constant> constants = new ArrayList<>();
        constants.add(null);
        //读取常量池的数量
        String constantCount = classMap.get(lineIndex).get(locationIndex) + classMap.get(lineIndex).get(++locationIndex);
        klass.setConstant_count(Integer.parseInt(constantCount,16) - 1);
        //读取常量
        for(int count=0; count<klass.getConstant_count(); count++){
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
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues_1[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    Integer length = Integer.parseInt(classValues_1[0]+classValues_1[1],16);
                    String[] classValues_2 = new String[length];
                    byte[] bytes = new byte[length];
                    for(int i=0; i<length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues_2[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    utf8Info.setLength(length);
                    utf8Info.setClassValue(tag + mergeStringArray(classValues_1, classValues_2));
                    try {
                        utf8Info.setBytes(Hex.decodeHex(mergeStringArray(classValues_2).toCharArray()));
                    } catch (DecoderException e) {
                        e.printStackTrace();
                        System.out.println("utf-8转bytes异常");
                    }
                    constants.add(utf8Info);
                    break;
                }case "03": {
                    IntegerConstantInfo integerInfo = new IntegerConstantInfo();
                    String[] classValues = new String[2];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    integerInfo.setClassValue(tag + mergeStringArray(classValues));
                    //TODO
                    integerInfo.setBytes(mergeStringArray(classValues).getBytes())
                            .setRealValue(Integer.parseInt(mergeStringArray(classValues), 16));
                    constants.add(integerInfo);
                    break;
                }case "04": {
                    FloatConstantInfo floatInfo = new FloatConstantInfo();
                    String[] classValues = new String[2];
                    for(int i=0; i<2; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    floatInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setBytes(mergeStringArray(classValues).getBytes())
                            .setRealValue(Float.intBitsToFloat(Integer.parseInt(mergeStringArray(classValues),16)));
                    constants.add(floatInfo);
                    break;
                }case "05": {
                    LongConstantInfo longInfo = new LongConstantInfo();
                    String classValues[] = new String[8];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    longInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setHighBytes(new String(mergeStringArray(classValues).getBytes(),0,8).getBytes())
                            .setLowBytes(new String(mergeStringArray(classValues).getBytes(),0,8).getBytes())
                            .setRealValue(Long.parseLong(mergeStringArray(classValues), 16));
                    constants.add(longInfo);
                    constants.add(null);
                    //count++;
                    break;
                }case "06": {
                    DoubleConstantInfo doubleInfo = new DoubleConstantInfo();
                    String classValues[] = new String[8];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    doubleInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setHighBytes(new String(mergeStringArray(classValues).getBytes(),0,8).getBytes())
                            .setLowBytes(new String(mergeStringArray(classValues).getBytes(),8,8).getBytes())
                            .setRealValue(Double.longBitsToDouble(Long.parseLong(mergeStringArray(classValues), 16)));
                    constants.add(doubleInfo);
                    constants.add(null);
                    //count++;
                    break;
                }case "07": {
                    ClassConstantInfo classInfo = new ClassConstantInfo();
                    String[]  classValues = new String[2];
                    for(int i=0; i<2; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
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
                        locationIndex = resetLocationIndex(locationIndex,16);
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
                        locationIndex = resetLocationIndex(locationIndex,16);
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
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    methodref.setClassValue(tag + classValues[0] + classValues[1] + classValues[2] + classValues[3]);
                    methodref.setClassIndex(classValues[0] + classValues[1]);
                    methodref.setNameAndTypeIndex(classValues[2]+classValues[3]);
                    constants.add(methodref);
                    break;
                }case "0b": {
                    InterfaceMethodrefConstantInfo interfaceMethodrefInfo = new InterfaceMethodrefConstantInfo();
                    String[] classValues = new String[4];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    interfaceMethodrefInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setClassIndex(classValues[0] + classValues[1])
                            .setNameAndTypeIndex(classValues[2] + classValues[3]);
                    constants.add(interfaceMethodrefInfo);
                    break;
                }case "0c": {
                    NameAndTypeConstantInfo nameAndTypeInfo = new NameAndTypeConstantInfo();
                    String[] classValues = new String[4];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    nameAndTypeInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setNameIndex(classValues[0] + classValues[1])
                            .setDescriptionIndex(classValues[2] + classValues[3]);
                    constants.add(nameAndTypeInfo);
                    break;
                }case "0f": {
                    MethodHandleConstantInfo methodHandleInfo = new MethodHandleConstantInfo();
                    String[] classValues = new String[3];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    methodHandleInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setReferenceKind(classValues[0])
                            .setReferenceIndex(classValues[1] + classValues[3]);
                    constants.add(methodHandleInfo);
                    break;
                }case "10": {
                    MethodTypeConstantInfo methodTypeInfo = new MethodTypeConstantInfo();
                    String[] classValues = new String[2];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    methodTypeInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setDescriptionIndex(classValues[0] + classValues[1]);
                    constants.add(methodTypeInfo);
                    break;
                }case "12": {
                    InvokeDynamicConstantInfo invokeDynamicInfo = new InvokeDynamicConstantInfo();
                    String[] classValues = new String[4];
                    for(int i=0; i<classValues.length; i++){
                        locationIndex = resetLocationIndex(locationIndex,16);
                        classValues[i] = classMap.get(lineIndex).get(locationIndex);
                    }
                    invokeDynamicInfo.setClassValue(tag + mergeStringArray(classValues))
                            .setBootstrapMethodAttrIndex(classValues[0] + classValues[1])
                            .setNameAndTypeIndex(classValues[2] + classValues[3]);
                    constants.add(invokeDynamicInfo);
                    break;
                }
            }
        }
        constantPool.setConstants(constants);
        klass.setConstant_pool(constantPool);
        return lineIndex;
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

    public Integer resetLocationIndex(Integer locationIndex, int limint){
        locationIndex++;
        if(locationIndex == limint){
            lineIndex++;
            locationIndex = 0;
        }
        return locationIndex;
    }

    private boolean resolveAccessFlag(Map<Integer, ArrayList<String>> classMap) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i<2; i++){
            locationIndex = resetLocationIndex(locationIndex,16);
            stringBuffer.append(classMap.get(lineIndex).get(locationIndex));
        }
        switch (stringBuffer.toString()){
            case "0021": {klass.setAccess_flags("0x0021[public]");break;}
            case "0011": {klass.setAccess_flags("TODO");break;}
            case "0401": {klass.setAccess_flags("TODO");break;}
            case "2001": {klass.setAccess_flags("TODO");break;}
            case "4001": {klass.setAccess_flags("TODO");break;}
            case "4000": {klass.setAccess_flags("TODO");break;}

        }
        return true;
    }

    public boolean resolveKlassName(Map<Integer, ArrayList<String>> classMap){
        StringBuffer thisKlassName = new StringBuffer();
        StringBuffer superKlassName = new StringBuffer();
        for(int i=0; i<2; i++){
            locationIndex = resetLocationIndex(locationIndex,16);
            thisKlassName.append(classMap.get(lineIndex).get(locationIndex));
        }
        for(int i=0; i<2; i++){
            locationIndex = resetLocationIndex(locationIndex,16);
            superKlassName.append(classMap.get(lineIndex).get(locationIndex));
        }
        klass.setKlass_name(thisKlassName.toString());
        klass.setSuper_klass_name(superKlassName.toString());
        resolveInterfaces(classMap);
        return true;
    }

    public boolean resolveInterfaces(Map<Integer, ArrayList<String>> classMap){
        ArrayList<KInterface> interfaces = new ArrayList<>();
        StringBuffer interfaceCountString = new StringBuffer();
        for(int i=0; i<2;i++){
            locationIndex = resetLocationIndex(locationIndex,16);
            interfaceCountString.append(classMap.get(lineIndex).get(locationIndex));
        }
        int interfaceCount = Integer.parseInt(interfaceCountString.toString(), 16);
        klass.setInterface_count(interfaceCount);

        for(int i=0; i<interfaceCount; i++){
            KInterface kInterface = new KInterface();
            StringBuffer stringBuffer = new StringBuffer();
            for(int j=0; j<2; j++){
                locationIndex = resetLocationIndex(locationIndex,16);
                stringBuffer.append(classMap.get(lineIndex).get(locationIndex));
            }
            kInterface.setClassValues(stringBuffer.toString());
            interfaces.add(kInterface);
        }
        klass.setInterfaces(interfaces);
        return true;
    }

    public boolean resolveField(Map<Integer, ArrayList<String>> classMap){
        klass.setField_count(readBytes2Integer(classMap,2));
        ArrayList<Field> fields = new ArrayList<>();
        for(int i=0; i<klass.getField_count(); i++){
            Field field = new Field();
            ArrayList<Attribute> attributes = new ArrayList<>();
            field.setAccessFlag(readBytes2String(classMap,2))
                    .setNameIndex(readBytes2Integer(classMap,2))
                    .setDescriptionIndex(readBytes2Integer(classMap,2))
                    .setAttributeCount(readBytes2Integer(classMap,2));
            for(int j=0; j<field.getAttributeCount(); j++){
                Attribute attribute = new Attribute();
                attribute.setNameIndex(readBytes2Integer(classMap,2))
                        .setLength(readBytes2Integer(classMap,4));
                ArrayList<Info> infos = new ArrayList<>();
                for(int infoCount=0; infoCount<attribute.getLength(); infoCount++){
                    Info info = new Info();
                    info.setValue(readBytes2String(classMap,1));
                    infos.add(info);
                }
                attribute.setInfos(infos);
                attributes.add(attribute);
            }
            field.setAttributes(attributes);
            fields.add(field);
        }
        klass.setFields(fields);

        resolveMethod(classMap);
        return true;
    }

    /**
     *
     * @param classMap
     * @return
     */
    public boolean resolveMethod(Map<Integer, ArrayList<String>> classMap){
        klass.setMethod_count(readBytes2Integer(classMap,2));
        ArrayList<Method> methods = new ArrayList<>();
        for(int methodCount=0; methodCount<klass.getMethod_count(); methodCount++){
            Method method = new Method();
            ArrayList<Attribute> attributes = new ArrayList<>();
            method.setAccessFlag(readBytes2String(classMap,2))
                    .setNameIndex(readBytes2Integer(classMap,2))
                    .setDescriptionIndex(readBytes2Integer(classMap,2))
                    .setAttributeCount(readBytes2Integer(classMap,2));
            for(int attributeCount=0; attributeCount<method.getAttributeCount(); attributeCount++){
                Attribute attribute = new Attribute();
                ArrayList<Info> infos = new ArrayList<>();
                attribute.setNameIndex(readBytes2Integer(classMap,2))
                        .setLength(readBytes2Integer(classMap,4));
                for(int infoCount=0; infoCount<attribute.getLength(); infoCount++){
                    Info info = new Info();
                    info.setValue(readBytes2String(classMap,1));
                    infos.add(info);
                }
                attribute.setInfos(infos);
                attributes.add(attribute);
            }
            method.setAttributes(attributes);
            methods.add(method);
        }
        klass.setMethods(methods);

        resolveAttribute(classMap);
        return true;
    }

    public boolean resolveAttribute(Map<Integer, ArrayList<String>> classMap){
        klass.setAttribute_count(readBytes2Integer(classMap,2));
        ArrayList<Attribute> attributes = new ArrayList<>();
        for (int attributeCount=0; attributeCount<klass.getAttribute_count(); attributeCount++){
            Attribute attribute = new Attribute();
            ArrayList<Info> infos = new ArrayList<>();
            attribute.setNameIndex(readBytes2Integer(classMap,2))
                    .setLength(readBytes2Integer(classMap,4));
            for(int infoCount = 0; infoCount<attribute.getLength(); infoCount++){
                Info info = new Info();
                info.setValue(readBytes2String(classMap,1));
                infos.add(info);
            }
            attribute.setInfos(infos);
            attributes.add(attribute);
        }
        klass.setAdditionalAttributes(attributes);
        return true;
    }


    public String readBytes2String(Map<Integer, ArrayList<String>> classMap,int count){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0; i<count;i++){
            locationIndex = resetLocationIndex(locationIndex,16);
            stringBuffer.append(classMap.get(lineIndex).get(locationIndex));
        }
        return stringBuffer.toString();
    }

    public Integer readBytes2Integer(Map<Integer, ArrayList<String>> classMap,int count){
        String bytes2String = readBytes2String(classMap,count);
        return Integer.parseInt(bytes2String,16);
    }

    public void injectAttribute(Map<Integer, ArrayList<String>> classMap, String attributeType){
        switch(attributeType){
            case "Code":{
                CodeAttribute codeAttribute = new CodeAttribute();
                ArrayList<Code> codes = new ArrayList<>();
                codeAttribute.setNameIndex(readBytes2String(classMap,2))
                        .setLength(readBytes2Integer(classMap,4))
                        .setMaxStack(readBytes2Integer(classMap,2))
                        .setMaxLocals(readBytes2Integer(classMap,2))
                        .setCodeLength(readBytes2Integer(classMap,4));
                for(int codeCount=0; codeCount<codeAttribute.getCodeLength(); codeCount++){
                    Code code = new Code();
                    code.setCodeValues(readBytes2String(classMap,1));
                    codes.add(code);
                }
                codeAttribute.setCodes(codes).setExceptionTableLength(readBytes2Integer(classMap,2));
                ArrayList<ExceptionTable> exceptionTables = new ArrayList<>();
                for(int exceptionTableCount=0; exceptionTableCount<codeAttribute.getExceptionTableLength(); exceptionTableCount++){
                    ExceptionTable exceptionTable = new ExceptionTable();
                    exceptionTable.setStartPC(readBytes2Integer(classMap,2))
                            .setEndPC(readBytes2Integer(classMap,2))
                            .setHandlerPC(readBytes2Integer(classMap,2))
                            .setCatchType(readBytes2Integer(classMap,2));
                    exceptionTables.add(exceptionTable);
                }
                codeAttribute.setExceptionTables(exceptionTables);
                break;
            } case "ConstantValue":{
                ConstantValueAttribute constantValueAttribute = new ConstantValueAttribute();
                constantValueAttribute.setNameIndex(readBytes2String(classMap,2))
                        .setLength(readBytes2Integer(classMap,4))
                        .setConstantValueIndex(readBytes2Integer(classMap,2));
                break;
            } case "LineNumber":{
                LineNumberAttribute lineNumberAttribute = new LineNumberAttribute();
                ArrayList<LineNumberTable> lineNumberTables = new ArrayList<>();
                lineNumberAttribute.setNameIndex(readBytes2String(classMap,2))
                        .setLength(readBytes2Integer(classMap,4))
                        .setLineNumberTableLength(readBytes2Integer(classMap,2));
                for(int lineNumberTableCount=0; lineNumberTableCount<lineNumberAttribute.getLineNumberTableLength(); lineNumberTableCount++){
                    LineNumberTable lineNumberTable = new LineNumberTable();
                    lineNumberTable.setStartPC(readBytes2Integer(classMap,2))
                            .setLineNumber(readBytes2Integer(classMap,2));
                    lineNumberTables.add(lineNumberTable);
                }
                lineNumberAttribute.setLineNumberTables(lineNumberTables);
                break;
            } case "LocalVariable":{
                LocalVariableTypeAttribute localVariableTypeAttribute = new LocalVariableTypeAttribute();
                localVariableTypeAttribute.setNameIndex(readBytes2String(classMap,2))
                        .setLength(readBytes2Integer(classMap,4));
                ArrayList<LocalVariableTypeTable> localVariableTypeTables = new ArrayList<>();
                for(int localVariableTypeCount=0; localVariableTypeCount<localVariableTypeAttribute.getLocalVariableTypeLength();localVariableTypeCount++){
                    LocalVariableTypeTable localVariableTypeTable = new LocalVariableTypeTable();
                    localVariableTypeTable.setStartPC(readBytes2Integer(classMap,2))
                            .setLength(readBytes2Integer(classMap,2))
                            .setNameIndex(readBytes2Integer(classMap,2))
                            .setSignatureIndex(readBytes2Integer(classMap,2))
                            .setIndex(readBytes2Integer(classMap,2));
                    localVariableTypeTables.add(localVariableTypeTable);
                }
                localVariableTypeAttribute.setLocalVariableTypeTables(localVariableTypeTables);
                break;
            }
        }
    }
}
