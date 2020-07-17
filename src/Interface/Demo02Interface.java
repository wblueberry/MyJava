package Interface;
/*
1，接口的默认方法，可以通过接口实现类对象，直接调用
2，接口的默认方法，也可以被接口实现类进行覆盖重写
 */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建实现类对象
        MyInterfaceDefaultA A = new MyInterfaceDefaultA();
        A.methodAbs();//调用抽象方法，实际运行的是右侧实现类
        //调用默认方法。如果实现类当中没有，会向上找接口的
        A.methodDefault();
        System.out.println("===========================");

        //接口B
        MyInterfaceDefaultB B = new MyInterfaceDefaultB();
        B.methodAbs();
        B.methodDefault();
    }
}
