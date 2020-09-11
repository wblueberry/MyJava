package T2.List;

import java.util.LinkedList;

/*
java.util.linkedList集合 implements List接口
LinkedList集合的特点：
    1，底层是一个链表结构：查询慢，增删快
    2，里边包含了大量操作首尾元素的方法
    注意：使用LinkedList集合特有的方法，不能使用多态

    public void addFirst(E e):将指定元素插入此列表的开头
    public void addLast(E e):将指定元素添加到此列表的结尾
    public void push(E e):将元素推入此列表所表示的堆栈

    public E getFirst():返回此列表的第一个元素
    public E getLast():返回此列表的最后一个元素

    public E removeFirst():移除并返回此列表的第一个元素
    public E removeLast():移除并返回此列表的最后一个元素
    public E pop():从此列表所在的堆栈处弹出一个元素

    public boolean isEmpty():如果列表不会包含元素，则返回true
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();

    }

    private static void show01(){
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        //public void addFirst(E e):将指定元素插入此列表的开头
        linked.addFirst("w");
        System.out.println(linked);
        //public void addLast(E e):将指定元素添加到此列表的结尾
        linked.addLast("o");
        System.out.println(linked);
        //public void push(E e):将元素推入此列表所表示的堆栈
        linked.push("www");
        System.out.println(linked);

        //public E getFirst():返回此列表的第一个元素
        String s1 = linked.getFirst();
        System.out.println(s1);
        //public E getLast():返回此列表的最后一个元素
        String s2 = linked.getLast();
        System.out.println(s2);

        //public E removeFirst():移除并返回此列表的第一个元素
        String s3 = linked.removeFirst();
        System.out.println(s3);
        System.out.println(linked);
        //public E removeLast():移除并返回此列表的最后一个元素
        String s4 = linked.removeLast();
        System.out.println(s4);
        System.out.println(linked);
        //public E pop():从此列表所在的堆栈处弹出一个元素
        String s5 = linked.pop();
        System.out.println(s5);
        System.out.println(linked);

        //public boolean isEmpty():如果列表不会包含元素，则返回true
        boolean s6 = linked.isEmpty();
        System.out.println(s6);
    }
}
