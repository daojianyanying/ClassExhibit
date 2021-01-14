import com.common.people.klas.kernel.core.Utf8ConstantInfo;

public class TestConstant {
    public static void main(String[] args) {
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
}
