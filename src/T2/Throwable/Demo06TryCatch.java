package T2.Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch:异常处理的第二种方式，自己处理异常
格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
        异常的处理逻辑，怎样处理异常对象
        在工作中，会把异常信息记录到一个日志中
    }
    ...
    catch(异常名 变量名){
    }
注意：
    1，try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
    2，如果这些try中产生了异常，就会执行catch中的异常处理逻辑，执行完毕catch中
    的处理逻辑，继续执行try...catch之后的代码，如果try中没有产生异常，那么久不会执行catch
    中异常的处理逻辑，执行完try中的代码，继续执行try...catch
 */
public class Demo06TryCatch {
    public static void main(String[] args) /*throws IOException*/{
        try{
            readFiles("C:\\a.tx");
        }catch(IOException e){//抛出什么异常，就定义什么异常对象，用来接收这个异常对象
            //异常的处理逻辑，怎样处理异常对象
            //System.out.println("传递的文件后缀名不是.txt");
            /*
            Throwable 类中定义了3个异常处理的方法
                String getMessage():返回此throwable的简短描述
                String toString():返回此throwable的详细消息字符串
                void printStackTrace():JVM打印异常消息，默认此方法，打印的异常信息是最全面的
             */
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("后续代码");
    }
    public static void readFiles(String fileName) throws IOException{
        if(!fileName.equals("C:\\a.txt")){
            throw new FileNotFoundException("文件路径不符合");
        }
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不对");

        }
        System.out.println("路径没有问题，读取文件");
    }
}
