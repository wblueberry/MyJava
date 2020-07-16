package Arrays;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
1,public static double abs(double num):获取绝对值
2,public static double ceil(double num):向上取整
3,public static double floor(double num):向下取整
4,public static long round(double num):四舍五入

Math.PI代表近似的圆周率(double)

 */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-3.14));//3.14
        System.out.println(Math.abs(3.14));//3.14
        System.out.println("====================");

        //向上取整
        System.out.println(Math.ceil(3.9));//4.0
        System.out.println(Math.ceil(3.1));//4.0
        System.out.println(Math.ceil(3.0));//3.0
        System.out.println("=====================");

        //向下取整
        System.out.println(Math.floor(3.9));//3.0
        System.out.println(Math.floor(3.2));//3.0
        System.out.println(Math.floor(3.0));//3.0
        System.out.println("======================");

        //四舍五入(可以把小数变成整数)
        System.out.println(Math.round(2.7));//3
        System.out.println(Math.round(2.4));//2
        System.out.println(Math.PI);

    }
}
