package Methods;
/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld。
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }
    /*
    三要素：
    1，返回值类型：只是进行一大堆打印操作而言，没有计算，也没有结果要告诉调用处
    2，方法名称：printCount
    3，参数列表：到底要打印多少次？必须要告诉我，否则我也不知道多少次，没发打印。次数：int

     */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello,World！"+(i+1));
        }
    }
}
