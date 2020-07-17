package Interface;
/*
在任何版本的java中，都可以直接定义抽象方法
格式：
public abstract 返回值类型 方法名称（参数列表）；

注意事项：
1，接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2,这两个关键字修饰符，可以选择性地省略。
3,方法的三要素，可以根据需要随意选择
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs();//抽象方法

    public void method3();//抽象方法

    abstract void method();//抽象方法
}
