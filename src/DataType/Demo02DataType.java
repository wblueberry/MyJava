/*
强制类型转换
    1，特点：代码需要进行特殊的格式处理，不能自动完成
    2，格式：范围小的类型 范围小的变量名 = （范围大的类型）原本范围大的数据；
 注意事项：
 1，强制类型转换可能会发生精度损失，数据溢出等情况。
 2，byte/short/char这三种类型都可以发生数学运算，例如’+’；
 3，byte/short/char这三种类型都在运算的时候，会先被转换成int类型，然后再进行计算
 4，boolean类型不能发生数据类型转换
 */


package DataType;

public class Demo02DataType {
    public static void main(String[] args) {
        System.out.println(12);
        int num = (int) 100L;//强制转换
        System.out.println(num);
        //加法
        System.out.println('A' + 2);
        System.out.println('A' * 2);
    }
}
