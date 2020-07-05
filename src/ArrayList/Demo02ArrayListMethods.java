package ArrayList;

import java.util.ArrayList;

/*
ArrayList当中的常用方法有：
public boolean add(E e):向集合当中添加元素，参数类型和泛型一致。
备注：对于ArrayList集合来说，add添加动作一定是成功的，返回值代表添加是否成功
public E get(int index):向集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
public E remove(int index):从集合当中删除元素，参数是索引编号，返回值是被删除掉的元素。
public int size():获取集合的尺寸长度，返回值是集合当中包含的元素个数。 */
public class Demo02ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //向集合当中添加元素，参数类型和泛型一致。
        boolean success = list.add("杨幂");
        System.out.println(list);
        System.out.println("添加的动作是否成功:"+success);//true

        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("范冰冰");
        System.out.println(list);

        //向集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
        String name = list.get(2);
        System.out.println("第二号索引位置："+name);

        //从集合当中删除元素，参数是索引编号，返回值是被删除掉的元素。
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是："+whoRemoved);

        System.out.println(list);

        //获取集合的尺寸长度，返回值是集合当中包含的元素个数。
        int size = list.size();
        System.out.println("集合点长度是："+size);
    }
}
