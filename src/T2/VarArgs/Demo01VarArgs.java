package T2.VarArgs;
/*
可变参数：是JDK1.5之后出现的新特性
使用前提：
    当方法的参数类别数据类型已经确定，但是参数的个数不确定的时候，就可以使用可变参数。
使用方法：定义方法时使用
    修饰符 返回值类型 方法名（数据类型 ... 变量名){}
可变参数的原理：
    可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组，来存储这次参数
    传递的参数个数，可以是0个（不传递），1,2...多个
注意事项：
    1，一个方法的参数列表，只能有一个可变参数
    2，如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
 */

public class Demo01VarArgs {
    public static void main(String[] args) {
        int i = add(10,20);
        System.out.println(i);
    }
    /*
    定义计算（0-n）个整数和的方法
    已知：计算整数的和，数据类型已经确定为整形
    但是参数的个数不确定，这时候就可以使用可变参数。
     */
    public static int add(int ... arr){
        //System.out.println(arr);
        //System.out.println(arr.length);
        //return 0 ;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    //定义一个方法，计算两个int类型整数的和
    public static int add2(int a , int b ){
        return a+b;
    }
}
