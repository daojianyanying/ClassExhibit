package com.common.people.klas.kernel.read;

import java.io.*;

public class ReadClass {
    private static final String CLASS_PATH = "D:\\tools-idea\\github\\ClassKernel\\ClassKernelService\\target\\classes\\com\\common\\people\\klas\\kernel\\core\\Main.txt";

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(CLASS_PATH));
            FileReader fileReader = new FileReader(new File(CLASS_PATH));
            ReadClassContent(inputStream);
            ReadClassContent(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ReadClassContent();
    }

    public static void ReadClassContent(){
        try {
            FileInputStream inputStream = new FileInputStream(new File(CLASS_PATH));
            ReadClassContent(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void ReadClassContent(FileInputStream fileInputStream){
        int len;
        byte[] bytes = new byte[1024];
        try {
            //len = FileInputStream.read()  会出现-1 的情况，所以判断条件应该为>0
            while( (len = fileInputStream.read(bytes)) > 0){
                System.out.println(len);
                System.out.print(new String(bytes, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadClassContent(FileReader fileReader){
        char[] chars = new char[1024];

        try {
            while( fileReader.read(chars) > 0){
                System.out.println(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
