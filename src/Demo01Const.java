/*
常量：在程序运行期间，固定不变的量。
常量的分类：
 1，字符串常量：凡是用双引号引起来的部分，就叫做字符串常量。如"abc"
 2,整数常量：直接写上的数字，没有小数点，例如：100、200
 3，浮点数常量：直接写上的数字，有小数点，例如2.5、3.14
 4，字符常量：凡是用单引号引起来的字符，就叫做字符常量。例如：’A‘
 5,布尔常量：true、false
 6，空常量：null。代表没有任何数据。
 */

public class Demo01Const {
    public static void main(String[] args){
        //字符串常量
        System.out.println("Hello,What are you doing?");
        System.out.println("");//内容为空
        System.out.println("XYZ");//内容为空
        //整数常量
        System.out.println(30);
        System.out.println(-20);
        //浮点数常量
        System.out.println(3.14);
        System.out.println(-2.5);
        //字符常量
        System.out.println('A');//引号之间必须有一个东西，不然会报错
        //如果输入’AB‘就会报错，因为有两个
        //布尔常量
        System.out.println(true);
        System.out.println(false);
        //空常量。空常量不能之间用来打印输出
        //错误写法：System.out.println(null);
    }
}
