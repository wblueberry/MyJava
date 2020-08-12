package T2.Calendar;

import java.util.Calendar;

/*
java.util.Calendar类：日历类
calendar是一个抽象类，里边提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR ）
calendar类无法直接创建对象使用，里边有一个静态方法叫做getInstance（），该方法返回了calendar类的子类对象。
static Calendar getInstance(TimeZone zone, Locale aLocale)
          使用指定时区和语言环境获得一个日历。
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态
        System.out.println(c);
    }
}
