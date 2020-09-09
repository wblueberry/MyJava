package T2.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util
接口 Collection<E>

共性的方法：
public boolean add(E,e):把给定的对象添加到当前集合中。
public void clear():清空集合中所有元素
public boolean remove(E,e):把给定的对象在当前集合中删除
public boolean contains(E,e):判断当前集合中是否包含给定对象
public boolean isEmpty():判断当前集合是否为空
public int size():返回集合中元素的个数
public Object[] toArray():把集合中的元素，存储到数组中

 */
public class Demo01Collection {
    public static void main(String[] args) {
        //使用多态来从创建集合对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法 【】

        //public boolean add(E,e):把给定的对象添加到当前集合中。
        //一般都返回true，可以不用接收
        boolean b1 = coll.add("王小兰");
        System.out.println(b1);
        System.out.println(coll);

        coll.add("张小青");
        coll.add("...");
        System.out.println(coll);

        //public boolean remove(E,e):把给定的对象在当前集合中删除
        //返回值也是一个布尔值
        boolean b2 = coll.remove("...");
        System.out.println(b2);
        System.out.println(coll);

        //public boolean contains(E,e):判断当前集合中是否包含给定对象
        boolean b3 = coll.contains("张小青");
        System.out.println(b3);
        System.out.println(coll);

        //public int size():返回集合中元素的个数
        int in1 = coll.size();
        System.out.println(in1);
        System.out.println(coll);

        //public boolean isEmpty():判断当前集合是否为空
        boolean b4 = coll.isEmpty();
        System.out.println(b4);
        System.out.println(coll);

        //public Object[] toArray():把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //public void clear():清空集合中所有元素,但是不删除集合本身
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());

    }
}
