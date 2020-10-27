package T2.Stream;

import java.util.stream.Stream;

/*
Stream流中常用方法：filter：用于对Stream流中的数据进行过滤
Stream<T> filter(Predicate<? super T> predicate);
filter的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
Predicate中的抽象方法：
    boolean test(T t);

 */
public class Demo05StreamFilter {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌","张小青");
        //对Stream流中的数据进行过滤,只要姓张的
        Stream<String> stream1 = stream.filter(name->name.startsWith("张"));
        //遍历一下stream1
        //stream1.forEach(name->System.out.println(name));

        Stream<String> stream2 = stream1.filter(i->i.endsWith("青"));
        stream2.forEach(e->System.out.println(e));

        /*
        Stream流属于管道流，只能被消费一次（使用一次）
        第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
        而这时第一个Stream流已经使用完毕，就会关闭
        所以第一个Stream流就不能再调用方法了
         */
    }
}
