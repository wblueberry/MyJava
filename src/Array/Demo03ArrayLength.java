package Array;
/*
如何获取数组的长度，格式：
数组名称.length
将会得到一个int数字，代表数组的长度。

数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] array = new int[3];
        //静态初始化
        int[] arrayB = {10,20,30,40,50};
        System.out.println("数组的长度是："+arrayB.length);
        System.out.println("================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
