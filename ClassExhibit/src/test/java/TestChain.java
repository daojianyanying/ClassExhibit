import java.util.Arrays;

public class TestChain {
    private String tag;
    //显示XXD生成的字节码文件的字面值
    private String classValue;
    //解释utf-8_constant_info的作用
    private String description;

    private Integer length;
    private byte[] bytes;



    public TestChain setTag(String tag){
        this.tag = tag;
        return this;
    }

    public TestChain setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public TestChain setDescription(String description){
        this.description = description;
        return this;
    }

    public TestChain setLength(Integer length){
        this.length = length;
        return this;
    }

    public TestChain setBytes(byte[] bytes){
        this.bytes = bytes;
        return this;
    }

    @Override
    public String toString() {
        return "TestChain{" +
                "tag='" + tag + '\'' +
                ", classValue='" + classValue + '\'' +
                ", description='" + description + '\'' +
                ", length=" + length +
                ", bytes=" + Arrays.toString(bytes) +
                '}';
    }
}

