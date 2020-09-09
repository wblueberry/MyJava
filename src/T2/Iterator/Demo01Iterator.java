package T2.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个常用的方法：
    boolean hasNext()如果仍有元素可以迭代，则返回 true。
    （换句话说，如果 next 返回了元素而不是抛出异常，则返回 true）。

返回：
如果迭代器具有多个元素，则返回 true。

E next()返回迭代的下一个元素。

返回：
迭代的下一个元素。
抛出：
NoSuchElementException - 没有元素可以迭代。

Iterator迭代器，是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
Collection接口中有一个方法，叫做iterator（），这个方法返回的元素就是迭代器的实现类对象。
    Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器。

迭代器的使用步骤（重点）：
1，使用集合中的方法iterator（）获取迭代器的实现类对象，使用Iterator接口接收（多态）
2，使用Iterator接口中的方法的hasNext（）判断还有没有下一个元素
3，使用Iterator接口中的next（）取出集合中的下一个元素


 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("王小兰");
        coll.add("王爱");
        coll.add("赵丽颖");
        coll.add("杨幂");
        coll.add("迪丽热巴");

        //1，使用集合中的方法iterator（）获取迭代器的实现类对象，使用Iterator接口接收（多态）
        //注意：Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
        //多态  接口            实现类对象
        Iterator<String> it = coll.iterator();

        //使用迭代器取出集合元素的代码，是一个重复的过程，所以可以使用循环优化
        //不知道集合中有多少元素，使用while循环，循环结束条件，hasNext方法返回false

        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

        System.out.println("===================================");

        //使用for循环
        for(Iterator<String> it2 = coll.iterator();it2.hasNext();){
            String e = it2.next();
            System.out.println(e);
        }


        //2，使用Iterator接口中的方法的hasNext（）判断还有没有下一个元素
        //boolean b = it.hasNext();
        //System.out.println(b);//true

        //3，使用Iterator接口中的next（）取出集合中的下一个元素
        //String s = it.next();
        //System.out.println(s);
    }
}
