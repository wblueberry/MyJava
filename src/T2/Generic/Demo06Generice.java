package T2.Generic;

import java.util.ArrayList;
import java.util.Collection;

/*
泛型的上限限定：? extends E 代表使用的泛型只能是E类型的子类/本身
泛型的下限限定：? super E  代表使用的泛型只能是E类型的父类/本身
 */
public class Demo06Generice {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>();
        Collection<Number> list3 = new ArrayList<>();
        Collection<Object> list4 = new ArrayList<>();

        getElement1(list1);
        getElement1(list2);//报错
        getElement1(list3);
        getElement1(list4);//报错

        getElement2(list1);//报错
        getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
        /*
        类与类之间的继承关系：
        Integer extends Number extends Object
        String extends Object
         */
    }
    //泛型的上限：此时的泛型?必须是Number理想或者Number类型的子类
    private static void getElement1(Collection<? extends Number> coll) {
    }
    //泛型的下限：此时的泛型?必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){

    }
}
