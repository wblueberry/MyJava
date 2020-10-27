package T2.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
Stream流常用方法count：用于统计Stream流中的元素个数
Long count();
count是一个终结方法，返回值是一个long类型的整数
所以不能再继续调用stream的其他方法
 */
public class Demo07StreamCount {
    public static void main(String[] args) {
        //获取一个流
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);//7
    }
}
