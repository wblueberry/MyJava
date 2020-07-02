package Array;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值。
访问数组元素的格式：数组名称【索引值】
索引值：就是一个int数字，代表数组当中元素的编号
注意：索引值从0开始，一直到数组长度-1为止
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int[] array = {10,20,30};
        System.out.println(array);
        System.out.println(array[1]);

    }
}
