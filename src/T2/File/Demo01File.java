package T2.File;

import java.io.File;

/*
java.io.File类
文件和目录路径名的抽象表达形式
java把电脑中的文件和文件夹（目录）封装为一个File类，我们可以使用File类对文件和文件夹进行操作
可以进行的操作：创建文件/文件夹，删除文件/文件夹，获取文件/文件夹，判断文件/文件夹是否存在，对文件夹进行遍历，获取文件的大小

File是一个与系统无关的类，任何的操作系统都可以使用这个类之中的方法

重点：记住这三个单词
    file ： 文件
    directory ： 文件夹/目录
    path ： 路径

 */
public class Demo01File {
    public static void main(String[] args) {
        //操作路径：路径不能写死了
        //分隔符可以用File.separator代替

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符  window下是分号，linux是冒号


        String separator = File.separator;
        System.out.println(separator);//文件名称分隔符  window下是一个反斜杠\ linux是正斜杠/
    }
}
