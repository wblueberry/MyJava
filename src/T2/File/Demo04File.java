package T2.File;

import java.io.File;

/*
File类遍历文件夹功能
    public String[] list():返回一个String数组，表示该File目录中的所有子文件或者目录
    public File[] listFile():返回一个File数组，表示该File目录中的所有子文件或者目录
 */
public class Demo04File {
    public static void main(String[] args) {
        show01();
        System.out.println("------------------------------------------");
        show02();
    }

    //public String[] list():返回一个String数组，表示该File目录中的所有子文件或者目录
    private static void show01(){
        File file = new File("G:\\Java\\MyJava\\src\\T2\\File");
        String[] arr = file.list();
        for (String fileName : arr) {
            System.out.println(fileName);
        }
    }

    //public File[] listFile():返回一个File数组，表示该File目录中的所有子文件或者目录
    private static void show02(){
        File file = new File("G:\\Java\\MyJava\\src\\T2\\File");
        File[] f1 = file.listFiles();
        for (File file1 : f1) {
            System.out.println(file1);
        }

    }
}
