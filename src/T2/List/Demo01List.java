package T2.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
java.util.List接口 extends Collection接口
List接口的特点：
    1，有序的集合，存储元素和取出元素的顺序是一致的
    2，有索引，包含了一些带有索引的方法
    3，允许存储重复的元素
List接口中带索引得到方法（特有）：
    public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
    public E get(int index):返回集合中指定位置的元素。
    public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
    public E set(int index， E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素。

注意：操作索引的时候，一定要防止索引越界异常。
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，多态
        List<String> list = new ArrayList<>();
        //使用add方法往集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("e");
        //打印集合
        System.out.println(list);//打印的不是地址，说明重写了toString方法

        //public void add(int index, E element):将指定的元素，添加到该集合中的指定位置上。
        //b和c之间添加i
        list.add(2,"i");
        System.out.println(list);


        //public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
        //移除c元素
        String r = list.remove(3);
        System.out.println(list);
        System.out.println(r);

        //public E set(int index， E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素。
        //a换成A
        String r2 =list.set(3,"A");
        System.out.println(r2);
        System.out.println(list);

        //list集合遍历有三种方式
        //普通的for循环
        for (int i = 0; i < list.size(); i++) {
            //public E get(int index):返回集合中指定位置的元素。
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("----------------------------------");

        //使用迭代器来遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }
    }
}
