package T2.Stream;

import java.util.stream.Stream;

/*
Stream流中的常用方法limit：用于截取流中的元素
limit方法可以对流进行截取，只取用前n个。
Stream<T> limit(long maxSize);
    参数是一个long类型，如果集合当前长度大于参数则进行截取，否则不进行操作
limit方法是一个延迟方法，只是对流中的元素进行截取，返回的是一个新的流，
所以可以继续调用stream流中的其他的方法
 */
public class Demo08StreamLimit {
    public static void main(String[] args) {
        //获取一个流
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","红太狼","灰太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用limit方法对stream流的元素进行截取，只要前三个元素
        Stream<String> stream1 = stream.limit(3);
        //遍历stream1
        stream1.forEach(i->System.out.println(i));

    }
}
