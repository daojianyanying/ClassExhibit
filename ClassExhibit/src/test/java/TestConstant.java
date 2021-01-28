import com.common.people.klass.exhibit.entity.constant.*;
import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class TestConstant {
    public static void main(String[] args) {
        test01();
        test02();
    }

    public static void test01(){
        Utf8ConstantInfo utf8ConstantInfo = new Utf8ConstantInfo();
        utf8ConstantInfo.setLength(6);
        utf8ConstantInfo.setBytes(new byte[]{47,58});
        utf8ConstantInfo.setClassValue("0001 ed45 edad fege");
        //System.out.println(utf8ConstantInfo);
        TestChain testChain = new TestChain();
        testChain.setTag("1")
                .setClassValue("0001 5efe 5f5e")
                .setDescription("描述")
                .setLength(8);
        System.out.println(testChain);
    }

    public static void test02(){
        ArrayList<Constant> constantsPool = new ArrayList<>();
        constantsPool.add(new Utf8ConstantInfo());
        constantsPool.add(new IntegerConstantInfo());
        constantsPool.add(new FloatConstantInfo());
        constantsPool.add(new LongConstantInfo());
        constantsPool.add(new DoubleConstantInfo());
        constantsPool.add(new ClassConstantInfo());
        constantsPool.add(new StringConstantInfo());
        constantsPool.add(new FieldrefConstantInfo());
        constantsPool.add(new MethodrefConstantInfo());
        constantsPool.add(new InterfaceMethodrefConstantInfo());
        constantsPool.add(new NameAndTypeConstantInfo());
        constantsPool.add(new MethodHandleConstantInfo());
        constantsPool.add(new MethodTypeConstantInfo());
        constantsPool.add(new InvokeDynamicConstantInfo());
        System.out.println(constantsPool.size());
    }
}
