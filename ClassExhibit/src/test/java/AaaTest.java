import com.common.people.klass.exhibit.entity.constant.ClassConstantInfo;
import com.common.people.klass.exhibit.entity.constant.FieldrefConstantInfo;
import com.common.people.klass.exhibit.entity.constant.NameAndTypeConstantInfo;
import com.common.people.klass.exhibit.entity.constant.Utf8ConstantInfo;
import com.common.people.klass.exhibit.entity.trunk.Constant;

import java.util.ArrayList;

public class AaaTest implements Constant{
    private static final String TAG = "9";
    private static final String DESCRIPTION = "相当于Constant_Fielder_Info,字段类型所占字节长度为5";

    private String classValue;

    private String classIndex;
    private String nameAndTypeIndex;



    public AaaTest setClassValue(String classValue){
        this.classValue = classValue;
        return this;
    }

    public AaaTest setClassIndex(String classIndex){
        this.classIndex = classIndex;
        return this;
    }

    public AaaTest setNameAndTypeIndex(String nameAndTypeIndex){
        this.nameAndTypeIndex = nameAndTypeIndex;
        return this;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void setIndexValue(ArrayList<Constant> constants) {

    }

}
