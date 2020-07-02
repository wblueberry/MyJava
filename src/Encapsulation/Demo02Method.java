package Encapsulation;
/*
面向对象三大特征：封装、继承、多态
封装性在java当中的体现：
1，方法就是一种封装
2，关键字private也是一种封装
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {2,15,25,35,45,99};

        int max = getMax(array);
        System.out.println("最大值："+max);

    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
