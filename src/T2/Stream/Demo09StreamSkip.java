package T2.Stream;

import java.util.stream.Stream;

/*
Stream流中的常用方法skip：用于跳过元素
如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流：
Stream<T> skip(long n);
    如果流的长度大于n，则跳过前n个，否则会得到一个空流

 */
public class Demo09StreamSkip {
    public static void main(String[] args) {
        //获取一个流
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","红太狼","灰太狼"};
        Stream<String> stream = Stream.of(arr);
        //使用skip方法跳过前3个元素
        Stream<String> stream1 = stream.skip(3);
        //遍历stream1
        stream1.forEach(i->System.out.println(i));
    }
}
