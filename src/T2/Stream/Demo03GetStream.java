package T2.Stream;

import java.util.*;
import java.util.stream.Stream;

/*
java.util.stream.Stream<T>是Java8新加入的最常用的流接口。（并不是一个函数式接口）
获取一个流的常用方式：
    1，所有的Collection集合都可以通过stream默认方法获取流
        default Stream<E> stream()
    2,Stream接口的静态方法of可以获取数组对应的流
        static <T> Stream<T> of(T...values)
        参数是一个可变参数，那么我们就可以传递一个数组

 */
public class Demo03GetStream {
    public static void main(String[] args) {
        //把集合转换为stream流
        //1，所有的Collection集合都可以通过stream默认方法获取流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键，存储到一个set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        //获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        //获取键值对(键与值的映射关系：entrySet)
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream5 = entries.stream();

        //把数组转换为流
        //2,Stream接口的静态方法of可以获取数组对应的流
        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,6,7,8);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5,6};
        Stream<Integer> stream7 = Stream.of(arr);
    }
}
