package Main01.Demo04;
/*
如果接口的实现类或者父类的子类，只需要使用唯一的一次
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

匿名内部类的定义：
格式：
接口名称 对象名 = new 接口名称（）{
        //覆盖重写所有的抽象方法
    }

对格式进行解析：
1，new代表创建对象的动作
2，接口名称就是匿名内部类需要事项的接口
3，{}这个是匿名内部类的内容

注意：
1，匿名内部类在【创建对象】的时候，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，只能使用实现类。
2，匿名对象，在【调用方法】的时候，只能调用唯一一次，如果想调用
多次，必须给对象起个名字。
3，匿名内部类是省略了实现类或者子类，匿名对象是省略了对象名称，不是一回事。


 */
public class DemoMain {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method1();
        impl.method2();

        MyInterface obj = new MyInterfaceImpl();
        obj.method1();
        obj.method2();

        //使用匿名内部类,但是不是匿名对象
        MyInterface obj1 = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法1");
            }
            @Override
            public void method2(){
                System.out.println("匿名内部类实现了方法2");
            }
        };
        obj1.method1();//匿名内部类实了方法
        obj1.method2();//匿名内部类实了方法

        //使用了匿名内部类。并且使用了匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法1");
            }
            @Override
            public void method2(){
                System.out.println("匿名内部类实现了方法2");
            }
        }.method1();


    }
}
