package Array;
/*
如果访问的数组元素的时候，所以编号不存在，那么将会发生数组索引越界异常
ArrayIndexOutOfBoundsException
原因：索引编号写错了。
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15,25,35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //错误写法：
        //数组索引越界异常
//        System.out.println(array[3]);
    }
}
