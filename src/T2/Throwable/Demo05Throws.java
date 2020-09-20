package T2.Throwable;

import java.io.FileNotFoundException;

/*
throws关键字：异常处理的第一种方式，交给别人处理
作用：
    当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
    可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理
    最终交给JVM处理-->中断处理
使用格式：在方法声明的时候使用
    修饰符 返回值类型 方法名（参数列表） throws AAAException,BBBException...{
        throws new AAAException("产生原因");
        throws new BBBException("产生原因");
        ...
    }

注意事项：
    1，throws关键字必须写在方法的声明处
    2，throws关键字后面声明的异常必须是Exception或者是Exception的子类
    3，方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
        如果抛出的多个异常对象有父子关系，那么直接声明父类异常即可
    4，调用了一个声明抛出异常的方法，我们就必须处理声明的异常
        要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
        要么try...catch自己处理异常

 */
public class Demo05Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFiles("C:\\a.txt");
    }

    /*
    定义一个方法，对传递的文件路径进行合法性判断
        如果路径不是”C：\\a.txt",那么我们就抛出文件找不到异常对象，并且告知调用者
    注意：FileNotFoundException是编译异常，抛出了编译异常就必须处理这个异常
    可以使用throws继续抛出。。。

     */
    public static void readFiles(String fileName) throws FileNotFoundException{
        if(!fileName.equals("C:\\a.txt")){
            throw new FileNotFoundException("文件路径不符合");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
