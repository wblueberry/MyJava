package T2.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo03Generic {
    public static void main(String[] args) {
        //show01();
        show02();
    }
    /*
    创建集合对象，使用泛型
    好处：
    1，避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型的数据
    2，把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候会报错）
    坏处：
    泛型是什么类型，只能存储什么类型的数据。
     */
    private static void show02(){
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }


    /*
    创建集合对象，不使用泛型
    好处：集合不适用泛型，默认的类型就是object类型，可以存储任意类型的数据
    坏处：不安全，会引发异常
     */
    private static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        //使用迭代器遍历集合list
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法的hasNext和next遍历集合
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法，length获取字符串的长度，不能使用多态：
            //Object obj = "abc"
            //需要向下转型
            //会抛出ClassCastException类型转换异常，不能把Integer类型转换为String类型。
            String s = (String)obj;
            System.out.println(s.length());
        }
    }
}
