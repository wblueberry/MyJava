package Interface.Demo2;
/*
这个子接口当中有4个方法
methodA()来源于接口A
methodB()来源于接口B
methodCommon（）同时来源于接口AB
method（）来源于自己

注意事项：
1，多个父接口当中的抽象方法如果重复，没关系。
2，多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写
而且要带着【default】关键字

 */
//import Interface.Demo1.MyInterfaceB;

public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefaule() {

    }
}
