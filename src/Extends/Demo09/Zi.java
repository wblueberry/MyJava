package Extends.Demo09;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种：
1，在本类的成员方法中，访问本类的成员变量。
2，在本类的成员方法中，访问本类的另一个成员方法
3,在本类的构造方法中，访问本类的另一个构造方法
在第三种用法当中要注意：
this(...)调用也必须是构造方法的第一个语句，而且只能有一个
super和this两种构造调用，不能同时使用
 */
public class Zi extends Fu{

    int num = 20;

    public Zi(){//无参构造方法
        this(123);//本类的无参构造调用本类的有参构造函数
    }

    public Zi(int n ){//有参构造函数

    }

    public Zi(int n ,int m){//两个参数的构造函数

    }

    public void showNum(){
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }
    public void methodA(){//成员方法A
        System.out.println("AAA");
    }
    public void methodB(){//成员方法B
        this.methodA();//在本类的成员方法中，访问本类的另一个成员方法
        System.out.println("BBB");
    }
}
