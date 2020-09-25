package T2.File;

import java.io.File;

/*
File类获取功能的方法
    1，public String getAbsolutePath():返回此File的绝对路径名字符串
    2，public String getPath():将此File转换为路径名字符串
    3，public String getName():返回由此File表示的文件或目录的名称
    4，public Long length():返回由此File表示的文件的长度
 */
public class Demo03File {
    public static void main(String[] args) {
        show02();
        show03();
        show04();
    }
    //1，public String getAbsolutePath():返回此File的绝对路径名字符串
    private static void show01(){
        File f1 = new File("G:\\Java\\MyJava\\src\\data.txt");
        String absoluteFile = f1.getAbsolutePath();
        File f2 = new File("123.txt");
        String ab2 = f2.getAbsolutePath();
        System.out.println(ab2);
        System.out.println(absoluteFile);
    }
    //2，public String getPath():将此File转换为路径名字符串
    //toString方法调用的就是getPath方法
    private static void show02(){
        File f2 = new File("G:\\Java\\MyJava\\123.txt");
        String ab1 = f2.getPath();
        System.out.println(ab1);
        System.out.println(f2.toString());
    }

    //3，public String getName():返回由此File表示的文件或目录的名称
    private static void show03(){
        File f3 = new File("G:\\Java\\MyJava\\123.txt");
        String name = f3.getName();
        System.out.println(name);
    }

    //4，public Long length():返回由此File表示的文件的长度
    //获取的是构造方法指定的文件的大小，以字节为单位
    //注意：文件夹是没有大小的概念。不能获取文件夹的大小
    //如果构造方法中给出的路径不存在，那么length方法返回0
    private static void show04(){
        File f4 = new File("G:\\Java\\MyJava\\123.txt");
        Long l = f4.length();
        System.out.println(l);
    }
}
