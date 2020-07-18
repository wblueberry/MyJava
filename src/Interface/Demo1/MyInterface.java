package Interface.Demo1;

public interface MyInterface {
    public default void method(){
        System.out.println("我是接口的默认方法");
    }
}
