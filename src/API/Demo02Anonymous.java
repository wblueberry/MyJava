package API;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc = new Scanner(System.in);
        //int num  = sc.nextInt();
        //匿名对象的方式
//        System.out.println("请输入一个数字：");
//        int num = new Scanner((System.in)).nextInt();
//        System.out.println("输入的是："+num);
        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);
        //匿名对象方式进行传参
        System.out.println("匿名对象作为参数：");
        methodParam(new Scanner(System.in));
        System.out.println("=================");


        System.out.println("匿名对象作为返回值：");
        Scanner sc = methodReturn();
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        System.out.println("输入的是："+num);


    }
    public static void methodParam(Scanner sc){
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
