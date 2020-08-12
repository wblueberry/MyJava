package T2.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用成员方法：
    public int get(int field):返回给定日历字段的值。
        int field：日历类的字段，可以使用calendar类的静态成员变量获取
        public static final int YEAR = 1; 年
        public static final int MONTH = 2; 月
        public static final int DATE = 5; 月中的某一天
        public static final int DAY_OF_MONTH = 5; 月中的某一天
        public static final int HOUR = 10; 时
        public static final int MINUTE = 12; 分
        public static final int SECOND = 13; 秒
    public void set(int field,int value):将给定的日历字段设置为给定值。
    public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减少指定的时间量。
    public Date getTime():返回一个表示此Calendar时间值（从；历元到现在的毫秒偏移量）的Date对象。


 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }
    /*
    public int get(int field):返回给定日历字段的值。
     */
    private static void demo01(){
        //使用getInstance方法获取Calendar对象
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int mouth = c.get(Calendar.MONTH);//西方的月份比中国少1
        System.out.println(mouth+1);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }
    /*
    public void set(int field,int value):将给定的日历字段设置为给定值。
    int field:传递指定的日历字段
    int value：给指定字段设置的值
     */
    private static void demo02(){
        Calendar c = Calendar.getInstance();

        //设置年为9999,月为9月，日期是9
        c.set(Calendar.YEAR,9999);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.DATE,9);
        //同时设置年月日,使用set的重载方法
        //c.set(8888,11,29);
        int year = c.get(Calendar.YEAR);
        System.out.print(year+"年-");
        int month = c.get(Calendar.MONTH);
        System.out.print(month+"月-");
        int date = c.get(Calendar.DATE);
        System.out.println(date+"日");
    }
    /*
    public abstract void add(int field,int amount)
     */
    private static void demo03(){
        Calendar c = Calendar.getInstance();

        //增加两年
        c.add(Calendar.YEAR,2);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        //月份减少三个月
        c.add(Calendar.MONTH,-3);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
    }
    /*
    public Date getTime()
    把日历对象转换为日期对象
     */
    private static void demo04(){
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date);
    }


}
