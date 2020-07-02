/*
当数据类型不一样的时候，会发生数据类型转换
自动类型转换（隐式）
    1，特点：代码不需要进行特殊处理，自动完成。
    2，规则：数据范围从小到大
强制类型转换（显示）
 */
package DataType;

public class Demo01DataType {
    public static void main(String[] args){
        System.out.println(1024);//默认整数
        System.out.println(3.14);//浮点数，默认为double

        long num1 = 100L;
        System.out.println(num1);//100
    }
}
