package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
要求使用自定义的方法来实现筛选

分析：
1，需要创建一个集合，用来存储int数字：<integer>
2,随机数字就用Random nextInt
3，循环20次把随机数字放入大集合：for循环，add方法
4，自定义一个方法，用来筛选
筛选：根据大集合，筛选符合要求的元素，得到小集合
三要素：
    1，返回值类型：ArrayList小集合（里面元素个数不确定）
    2，方法名称：getSmallList
    3，参数列表：ArrayList大集合（装着20个随机数字）
5.判断（if）是偶数：num%2==0
6,如果是偶数，就放到小集合当中，否则不放
 */
public class Demo05ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;//1-100
            bigList.add(num);
        }
        System.out.println(bigList);

        //打印小集合里面的元素
        ArrayList<Integer> list1 = getSmallList(bigList);

        System.out.println("偶数的个数："+list1.size());
        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {

            if(i==list1.size()-1){
                System.out.print(list1.get(i));
            }else{
                System.out.print(list1.get(i)+",");
            }
        }
        System.out.print("]");
    }
    //这个方法，接收大集合参数，返回小集合结果
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList1){
        //创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList1.size(); i++) {
            int num =bigList1.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
