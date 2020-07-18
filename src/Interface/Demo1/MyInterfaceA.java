package Interface.Demo1;

public interface MyInterfaceA {
    //错误写法,接口不能有静态代码块
    // static {}
    //接口不能有构造方法
    //public MyInterface(){}
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("我是默认方法，我叫A！");
    }
}
