package ArrayList;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}括起集合，使用@分隔每个元素
格式参照{元素1@元素2@元素3}。
System.out.println(list);    [10,20,30]
printArrayList(list);        {10@20@30}
 */
public class Demo05ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("范冰冰");
        list.add("杨幂");
        System.out.println(list);
        printArrayList(list);
    }
    /*
    定义方法的三要素：
    1，返回值类型：只是进行打印而已，没有运算，没有结果，所以用void
    2，方法名称：printArrayList
    3，参数列表：ArrayList
     */

    public static void printArrayList(ArrayList<String>list1){
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list1.size(); i++) {
            String name = list1.get(i);
            if(i==list1.size()-1){
                System.out.println(name+"}");
            }else{
                System.out.print(name+"@");
            }
        }
    }
}
