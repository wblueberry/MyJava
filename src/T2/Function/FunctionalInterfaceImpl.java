package T2.Function;
/*
@Override注解：检查方法是否为重写的方法
    是：编译成功
    否：编译失败
 */
public class FunctionalInterfaceImpl implements FunctionalInterface{
    @Override
    public void method() {
        System.out.println("hello");
    }
}
