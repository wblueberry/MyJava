package T2.StringBuilder;
/*
StringBuilder的常用方法：
1，public StringBuilder append(Object obj)
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建StringBuilder对象
        //append方法返回的是this，调用方法的对象bu1。
        StringBuilder bu1 = new StringBuilder();
//        StringBuilder bu2 = bu1.append("hello");
//        System.out.println(bu1);
//        System.out.println(bu2);
//        System.out.println(bu2==bu1);

        //使用append方法无需接收返回值
        bu1.append("hello");
        bu1.append(123);
        System.out.println(bu1);
        bu1.append(0).append(0).append(0);//链式编程。
        System.out.println(bu1);
    }
}
