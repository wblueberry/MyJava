package T2.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
作用：
格式化（也就是日期 -> 文本）、解析（文本-> 日期）
成员方法：
 String format(Date date)
          将一个 Date 格式化为日期/时间字符串。
 Date parse(String source)
          从给定字符串的开始解析文本，以生成一个日期。
 DateFormat是一个抽象类，无法直接创建对象使用，可以使用子类SimpleDateFormat

 构造方法：
 SimpleDateFormat(String pattern)
          用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
        参数String pattern：
            传递指定的格式
            y年M月d日H时m分s秒。。。
            写好对应的模式，会把模式替换成对应的日期和时间
        注意：模式中的字母不能更改，连接模式的符号可以改变。
 */
public class Demo03DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        System.out.println("=========================");
        demo02();
    }
    /*
    使用DateFormat类中的format，把日期格式化为文本
    使用步骤：
    1，创建SimpleDateFormat对象，构造方法中传递指定模式
    2，调用SimpleDateFormat对象中的方法format，按照指定模式，
    把日期格式化为符合模式的文本
     */
    private static void demo01(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String d = simpleDateFormat.format(date);
        System.out.println(d);
        System.out.println(date);

    }
    /*
    使用DateFormat类中的parse，把文本解析为日期
    使用步骤：
    1，调用SimpleDateFormat对象，构造方法中传递指定的模式
    2，调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为日期。
    注意：
    public Date parse(String source) throws parseException
    parse声明了一个异常叫做parseException，如果字符串和构造方法的模式不一样，就会抛出这个异常。
    调用一个抛出了异常的方法，就必须处理这个异常。
    处理：
    1，throws继续抛出这个异常
    2，try catch自己处理
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse("2020-08-12 11:24:41");
        System.out.println(date);
    }

}
