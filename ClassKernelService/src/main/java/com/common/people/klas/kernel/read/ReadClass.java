package com.common.people.klas.kernel.read;

import java.io.*;
import java.util.*;

public class ReadClass {
    private static final String CLASS_PATH = "D:\\tools-idea\\github\\ClassKernel\\ClassKernelService\\target\\classes\\com\\common\\people\\klas\\kernel\\core\\Main.txt";

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(CLASS_PATH));
            FileReader fileReader = new FileReader(new File(CLASS_PATH));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(CLASS_PATH));

            Map<Integer,ArrayList<String>> map = ReadClassContent(bufferedReader);
            ResolveClass solver = new ResolveClass();
            solver.resolve(map);
            //ReadClassContent(fileReader);
            //输出解析后的Klass对象
            System.out.println(solver.getKlass().toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //ReadClassContent();
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
        int len;
        try {
            while((len =  fileReader.read(chars)) > 0){
                String content = new String(chars,0,chars.length);
                System.out.println(new String(content.getBytes("UTF-8")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param bufferedReader
     * @return
     */
    public static Map<Integer,ArrayList<String>> ReadClassContent(BufferedReader  bufferedReader){
        int len;
        Integer lineNum = 0;
        HashMap<Integer, ArrayList<String>> classMap = new HashMap();

        try {
            while((len = bufferedReader.read()) != -1){
                String oneLine = bufferedReader.readLine();
                String[] hexStrings = new String(oneLine.getBytes(),9,39).split(" ");
                String[] demergeHexStrings = new String[16];
                for(int i=0; i<hexStrings.length; i++){
                    demergeHexStrings[2*i] = new String(hexStrings[i].getBytes(),0,2);
                    demergeHexStrings[2*i+1] = new String(hexStrings[i].getBytes(),2,2);

                }
                ArrayList<String> classArrayList = new ArrayList<>();
                Collections.addAll(classArrayList, demergeHexStrings);
                classMap.put(lineNum++,classArrayList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classMap;
    }

}
