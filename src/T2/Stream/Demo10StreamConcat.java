package T2.Stream;

import java.util.stream.Stream;

/*
Stream流中常用方法concat：用于把流组合在一起
如果有两个流，希望合并成一个流，那么可以使用stream接口的静态方法concat
static <T> Stream<T> concat(Stream<? extends T> a,Stream<? extends T> b)
 */
public class Demo10StreamConcat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌","张小青");
        //获取一个流
        String[] arr = {"美羊羊","喜羊羊","懒羊羊","红太狼","灰太狼"};
        Stream<String> stream2 = Stream.of(arr);
        //把两个流组合到一起
        Stream<String> concat = Stream.concat(stream1, stream2);
        //遍历concat
        concat.forEach(e->System.out.println(e));

    }
}
