package Extends.Demo04;
/*
在父子关系的继承当中,创建子类对象，访问成员方法规则：
    创建的对象是谁，就优先用谁，如果没有则向上找。

    注意事项：
    无论是成员方法还是成员变量，如果没有就向上找，绝对不会向下找子类的

重写（override）
概念：在继承关系当中，方法的名称一样，参数列表也一样。

 重写（override）：方法的名称一样，参数列表也一样。覆盖、覆写
 重载（overload）：方法的名称一样，参数列表不一样。

 方法的覆盖重写特点：创建的是子类对象，则优先用子类方法。
 */
public class Demo04ExtendsMethods {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();
        System.out.println("=======================");
        //创建的是子类对象，所以优先使用子类方法
        zi.method();
    }
}
