package Array;
/*
使用动态初始化数组的时候，其中元素会自动拥有一个默认值，规则如下：
如果是整数类型，默认为0；
如果是浮点类型，默认为0.0；
如果是字符类型，默认为'\u0000';
如果是布尔类型，默认为false；
如果是引用类型，默认为null；

注意事项：
静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成为了
大括号里面的具体数值
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("========================");
        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

    }
}
