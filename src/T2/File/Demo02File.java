package T2.File;

import java.io.File;

/*
路径：
    绝对路径：是一个完整的路径，以盘符开始
    相对路径：相对于当前项目的根目录
    如果使用当前目录的根目录，路径可以简化书写
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
        File类的构造方法
         */

        show02("G:","\\Java\\MyJava\\src\\data.txt");
    }
    /*
    File(String pathname) 通过给定路径名字符串转换为抽象路径名来创建一个新的File实例。
    参数：String pathname：字符串的路径名称
    路径可以是以文件结尾，也可以是以文件夹结尾，可以是相对/绝对路径，可以是存在/不存在的。
    创建File对象，只是把字符串路径封装进为File对象，不考虑路径真假的情况
     */
    private static void show01(){
        File f1 = new File("G:\\Java\\MyJava\\src\\data.txt");
        System.out.println(f1);//重写了Object的toString方法
    }

    /*
    File(String parent,String child) 根据parent路径名字符串和child路径名字符串创建一个新的File实例
    参数：把路径分为两个部分
    String parent 父路径
    String child  子路径
    好处：父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化

     */
    private static  void show02(String parent , String child){
        File f2 = new File(parent,child);
        System.out.println(f2);
    }

}
