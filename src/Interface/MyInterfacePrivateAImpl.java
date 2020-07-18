package Interface;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{

    public void methodAnother(){
        //methodCommon();//直接访问到了接口中的默认方法，错误方法
    }

}
