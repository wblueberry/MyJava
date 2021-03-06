package T2.Stream;
//延迟方法
import java.util.stream.Stream;

/*
如果需要将流中的元素映射到另一个流中，可以使用map方法
<R> Stream<R> map(Function<? super T,? extends R> mapper);
该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转发U了为另一种R类型的流
Function中的抽象方法：
    R apply(T t);

 */
public class Demo06StreamMap {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        //使用map方法，把字符串类型的整数，转换（映射）为Integer类型的整数
        Stream<Integer> stream1 = stream.map(s -> Integer.parseInt(s));
        //遍历一下stream1
        stream1.forEach(i->System.out.println(i));
    }
}
