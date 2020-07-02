package Methods;
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成
任务的时候，就是有参数
无参数：小括号留空。一个方法不需要任何数据资料，自己就能独立完成任务
就是无参数
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("===========================");
        method2();
    }
    //两个数字相乘，必须知道两个数字各是多少，否则无法计算
    //有参数
    public static int method1(int a,int b){
        int s = a * b;
        System.out.println(s);
        return s;
    }
    //打印输出固定2文字文本字符串
    public static void method2(){
        System.out.println("Hello,World!");
    }
}
