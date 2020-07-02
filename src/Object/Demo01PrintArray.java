package Object;

import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细
处理每一个细节。
面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具
有该功能的人，来帮我做事。
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //要求打印格式为：【10,20,30,40,50】
        //使用面向过程，每一个步骤细节都要亲力亲为
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.println(array[i]+",");
            }
        }
        System.out.println("========================");


        //使用面向对象
        //找一个JDK给我们提供好的Array类
        //其中有一个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
