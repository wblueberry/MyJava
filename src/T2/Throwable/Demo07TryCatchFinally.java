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
    }finally{
        无论是否出现异常都会执行
    }
注意:
    1，finally不能单独使用，必须和try一起使用
    2，finally一般用于资源释放（资源回收），无论程序是都出现异常，最后都要资源释放（I/O）

 */
public class Demo07TryCatchFinally {
    public static void main(String[] args) /*throws IOException*/{
        try {
            readFiles("C:\\a.tt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
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
