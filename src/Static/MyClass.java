package Static;

public class MyClass {
    int num;//成员变量
    static int numStatic;//静态变量

    public void method(){//成员方法
        System.out.println("这是一个普通的成员方法");
        System.out.println(num);//成员方法访问成员变量
        System.out.println(numStatic);//成员方法访问静态变量
    }

    public static void methodStatic(){//有static，是静态方法
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);//静态方法可以访问静态变量
        //静态方法不能直接访问非静态【重点】
        //System.out.println(num);//错误写法
        //静态方法中不能使用this关键字
    }
}
