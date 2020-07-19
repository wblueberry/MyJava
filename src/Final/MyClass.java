package Final;
/*
当final关键字用来修饰一个类
格式：
public final class 类名称{//...}

含义：当前这个类不能有任何的子类。
注意：一个类如果是final的，你们其中的成员方法都无法进行覆盖重写（没有子类）


 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行！");
    }
}
