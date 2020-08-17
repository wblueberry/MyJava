package T2.System;

import java.util.Arrays;

/*
public static long currentTimeMillis()返回以毫秒为单位的当前时间。
注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。
例如，许多操作系统以几十毫秒为单位测量时间。

public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)从指定源数组中复制一个数组，复制从指定的位置开始，
                             到目标数组的指定位置结束。从 src 引用的源数组到 dest 引用的目标数组，
                             数组组件的一个子序列被复制下来。被复制的组件的编号等于 length 参数。
                             源数组中位置在 srcPos 到 srcPos+length-1 之间的组件被分别复制到目标
                             数组中的 destPos 到 destPos+length-1 位置。
如果参数 src 和 dest 引用相同的数组对象，则复制的执行过程就好像首先将 srcPos 到 srcPos+length-1 位置的
组件复制到一个带有 length 组件的临时数组，然后再将此临时数组的内容复制到目标数组的 destPos
到 destPos+length-1 位置一样。

If 如果 dest 为 null，则抛出 NullPointerException 异常。

如果 src 为 null, 则抛出 NullPointerException 异常，并且不会修改目标数组。

否则，只要下列任何情况为真，则抛出 ArrayStoreException 异常并且不会修改目标数组：

src 参数指的是非数组对象。
dest 参数指的是非数组对象。
src 参数和 dest 参数指的是那些其组件类型为不同基本类型的数组。
src 参数指的是具有基本组件类型的数组且 dest 参数指的是具有引用组件类型的数组。
src 参数指的是具有引用组件类型的数组且 dest 参数指的是具有基本组件类型的数组。
否则，只要下列任何情况为真，则抛出 IndexOutOfBoundsException 异常，并且不会修改目标数组：

srcPos 参数为负。
destPos 参数为负。
length 参数为负。
srcPos+length 大于 src.length，即源数组的长度。
destPos+length 大于 dest.length，即目标数组的长度。
否则，如果源数组中 srcPos 到 srcPos+length-1 位置上的实际组件通过分配转换并不能转换成目标
数组的组件类型，则抛出 ArrayStoreException 异常。在这种情况下，将 k 设置为比长度小的最小非
负整数，这样就无法将 src[srcPos+k] 转换为目标数组的组件类型；当抛出异常时，从 srcPos 到 srcPos+k-1
位置上的源数组组件已经被复制到目标数组中的 destPos 到 destPos+k-1 位置，而目标数组中的其他位置不会被修改。
（因为已经详细说明过的那些限制，只能将此段落有效地应用于两个数组都有引用类型的组件类型的情况。）


参数：
src - 源数组。
srcPos - 源数组中的起始位置。
dest - 目标数组。
destPos - 目标数据中的起始位置。
length - 要复制的数组元素的数量。
抛出：
IndexOutOfBoundsException - 如果复制会导致对数组范围以外的数据的访问。
ArrayStoreException - 如果因为类型不匹配而使得无法将 src 数组中的元素存储到 dest 数组中。
NullPointerException - 如果 src 或 dest 为 null。

 */
public class Demo01System {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    //public static long currentTimeMillis()可以用来测试程序的效率
    private  static void demo1(){
        //程序执行前，获取一次毫秒值
        long s = System.currentTimeMillis();
        System.out.println(s);
        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
        //程序执行后，获取一次毫秒值
        long e = System.currentTimeMillis();
        System.out.println(e);
        System.out.println(e-s);
    }
    private static void demo2(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }
}
