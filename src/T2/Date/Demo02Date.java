package T2.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    /*
    Date类的空参数构造方法
    Date()获取当前系统的日期和时间
     */
    private static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
    /*
    Date的带参数的构造方法
    Date(long date):传递毫秒值，把毫秒值转换为Date日期
     */
    private static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);
        Date d = new Date(1597200833957L);
        System.out.println(d);
    }
    /*
    long getTime():把日期转换为毫秒值（相当于System.currentTimeMillis()）
     */
    private static void demo03(){//输出的是毫秒值
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
